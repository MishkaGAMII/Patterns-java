import com.mobile.Legacy.MicroUsbCharger;

public class AdapterTypeCToMicroUsb implements MicroUsbCharger {
    private static final float STANDARD_VOLTAGE = 5.0f;

    private final TypeCCharger typeCCharger;

    public AdapterTypeCToMicroUsb(TypeCCharger typeCCharger) {
        this.typeCCharger = typeCCharger;
    }

    @Override
    public float getOutputVoltage() {
        return STANDARD_VOLTAGE;
    }

    @Override
    public float getOutputAmperage() {
        return typeCCharger.getOutputPower() / STANDARD_VOLTAGE;
    }
}
