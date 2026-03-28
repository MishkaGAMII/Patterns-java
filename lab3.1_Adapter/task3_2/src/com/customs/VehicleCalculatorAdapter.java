package com.customs;

import com.vehiclecalculator.Vehicle;
import com.vehiclecalculator.VehicleCalculator;

/**
 * Адаптер, що дозволяє використовувати американський автомобільний калькулятор
 * у програмному забезпеченні української митниці.
 */
public class VehicleCalculatorAdapter implements Customs {

    private static final float UNDAMAGED_COEFFICIENT = 0.0f;
    private static final float DAMAGED_COEFFICIENT = 1.0f;

    private final VehicleCalculator vehicleCalculator;
    private final float usdToUahRate;
    private final float importDutyRate;

    public VehicleCalculatorAdapter(VehicleCalculator vehicleCalculator,
                                    float usdToUahRate,
                                    float importDutyRate) {
        this.vehicleCalculator = vehicleCalculator;
        this.usdToUahRate = usdToUahRate;
        this.importDutyRate = importDutyRate;
    }

    @Override
    public float vehiclePrice(Auto auto) {
        Vehicle vehicle = adaptAuto(auto);
        vehicleCalculator.setVehicle(vehicle);
        float priceInUsd = parseUsdPrice(vehicleCalculator.calculatePrice());
        return priceInUsd * usdToUahRate;
    }

    @Override
    public float tax(Auto auto) {
        return vehiclePrice(auto) * importDutyRate;
    }

    public float totalPrice(Auto auto) {
        return vehiclePrice(auto) + tax(auto);
    }

    private Vehicle adaptAuto(Auto auto) {
        float damage = auto.damaged ? DAMAGED_COEFFICIENT : UNDAMAGED_COEFFICIENT;
        return new Vehicle(auto.age, auto.model, damage, auto.mileage);
    }

    private float parseUsdPrice(String priceLine) {
        String normalized = priceLine
                .replace(',', '.')
                .replaceAll("[^0-9.]", "");

        if (normalized.isEmpty()) {
            throw new IllegalArgumentException("Не вдалося зчитати вартість авто з рядка: " + priceLine);
        }

        return Float.parseFloat(normalized);
    }
}
