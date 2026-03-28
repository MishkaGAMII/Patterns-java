package com.customs;

import com.vehiclecalculator.CarCalculator;
import com.vehiclecalculator.VehicleCalculator;

public class Main {

    private static final float USD_TO_UAH_RATE = 40.0f;
    private static final float IMPORT_DUTY_RATE = 0.10f;

    public static void main(String[] args) {
        Auto auto = new Auto(5, "Audi", true, 100_000);

        VehicleCalculator americanCalculator = new CarCalculator();
        VehicleCalculatorAdapter customsAdapter =
                new VehicleCalculatorAdapter(americanCalculator, USD_TO_UAH_RATE, IMPORT_DUTY_RATE);

        float vehiclePrice = customsAdapter.vehiclePrice(auto);
        float tax = customsAdapter.tax(auto);
        float totalPrice = customsAdapter.totalPrice(auto);

        System.out.println("Модель: " + auto.model);
        System.out.println("Вік: " + auto.age + " років");
        System.out.println("Пробіг: " + auto.mileage + " км");
        System.out.println("Пошкоджене: " + (auto.damaged ? "так" : "ні"));
        System.out.printf("Оціночна вартість авто: %.2f грн%n", vehiclePrice);
        System.out.printf("Розмір мита: %.2f грн%n", tax);
        System.out.printf("Повна вартість після розмитнення: %.2f грн%n", totalPrice);
    }
}
