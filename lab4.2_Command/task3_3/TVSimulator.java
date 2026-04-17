import java.util.Arrays;

public class TVSimulator {
    public static void main(String[] args) {
        Device tv = new Television();
        Device radio = new Radio();

        System.out.println("--- Testing separate devices ---");
        tv.on();
        tv.volumeUp();
        
        radio.on();
        radio.nextChanel();

        // ---------------------------------------------------------
        // Universal Remote Setup (Macro Command)
        // ---------------------------------------------------------
        Command turnOffTv = new TurnOffCommand(tv);
        Command turnOffRadio = new TurnOffCommand(radio);
        
        Command turnAllOff = new UniversalOffCommand(Arrays.asList(turnOffTv, turnOffRadio));

        RemoteController universalRemote = new RemoteController();
        universalRemote.setOffCommand(turnAllOff);

        System.out.println("\n--- Testing Universal Remote ---");
        universalRemote.deviceOff(); // Turns off TV and Radio
    }
}