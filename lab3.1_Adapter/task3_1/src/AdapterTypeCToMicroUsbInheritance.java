import com.mobile.Legacy.Charger;

public class AdapterTypeCToMicroUsbInheritance extends Charger {
    private static final float STANDARD_VOLTAGE = 5.0f;

    public AdapterTypeCToMicroUsbInheritance(float power) {
        super(STANDARD_VOLTAGE, power / STANDARD_VOLTAGE);
    }
}
