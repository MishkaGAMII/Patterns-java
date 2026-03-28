import com.mobile.Legacy.Charger;
import com.mobile.Legacy.MobilePhone;
import com.mobile.Legacy.MicroUsbCharger;

public class Main {

    public static void main(String[] args) {
        Charger microUsbCharger = new Charger(5.0f, 1.0f);
        FastCharge typeCCharger = new FastCharge(18.0f);

        System.out.println("\n============= Legacy micro-USB ==============\n");
        MobilePhone oldPhone = new MobilePhone();
        oldPhone.charge(20);
        oldPhone.pluginCharger(microUsbCharger);
        oldPhone.charge(20);
        oldPhone.unplugCharger();
        printLegacyBatteryStatus(oldPhone);

        System.out.println("\n============= USB Type-C ==============\n");
        SamsungS samsung = new SamsungS();
        samsung.makeCall();
        samsung.pluginCharger(typeCCharger);
        samsung.charge(30);
        samsung.unplugCharger();
        printBatteryStatus(samsung);

        System.out.println("\n============= Type-C -> micro-USB adapter (composition) ==============\n");
        MicroUsbCharger adapterByComposition = new AdapterTypeCToMicroUsb(typeCCharger);
        oldPhone.pluginCharger(adapterByComposition);
        oldPhone.charge(20);
        oldPhone.unplugCharger();
        printLegacyBatteryStatus(oldPhone);

        System.out.println("\n============= Type-C -> micro-USB adapter (inheritance) ==============\n");
        MicroUsbCharger adapterByInheritance = new AdapterTypeCToMicroUsbInheritance(typeCCharger.getOutputPower());
        oldPhone.pluginCharger(adapterByInheritance);
        oldPhone.charge(20);
        oldPhone.unplugCharger();
        printLegacyBatteryStatus(oldPhone);

        // Відповідь на питання задачі:
        // Двосторонній адаптер для цієї моделі створити можна, якщо реалізовувати його
        // через композицію, оскільки обидва інтерфейси описують той самий процес заряджання,
        // а перехід між ними зводиться до перетворення потужності у напругу/струм і навпаки.
        // Водночас універсальний двосторонній адаптер через наслідування у Java є
        // неприродним рішенням, бо клас не може одночасно наслідувати і зарядний пристрій
        // micro-USB, і зарядний пристрій Type-C. Тому для цієї задачі більш доцільний
        // об'єктний адаптер (через композицію).
    }

    private static void printBatteryStatus(SamsungS phone) {
        System.out.printf("Current battery status = %s%n", phone.getChargingPercent());
    }

    private static void printLegacyBatteryStatus(MobilePhone phone) {
        System.out.printf("Current power status = %s%n", phone.getChargingPercent());
    }
}
