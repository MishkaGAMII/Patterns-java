import java.util.Arrays;

public class Client {
    public static void main(String[] args) {
        Lamp kitchenLamp = new Lamp("Kitchen");
        Lamp hallLamp = new Lamp("Hall");
        Lamp bedroomLamp = new Lamp("Bedroom");
        Lamp bathroomLamp = new Lamp("Bathroom");

        Controller controllerKitchenLamp = new Controller();
        controllerKitchenLamp.setCommands(new LampOnCommand(kitchenLamp), new LampOffCommand(kitchenLamp));

        Controller controllerHallLamp = new Controller();
        controllerHallLamp.setCommands(new LampOnCommand(hallLamp), new LampOffCommand(hallLamp));

        Controller controllerBedroomLamp = new Controller();
        controllerBedroomLamp.setCommands(new LampOnCommand(bedroomLamp), new LampOffCommand(bedroomLamp));

        Controller controllerBathroomLamp = new Controller();
        controllerBathroomLamp.setCommands(new LampOnCommand(bathroomLamp), new LampOffCommand(bathroomLamp));

        // Створюємо Універсальний пульт за допомогою макрокоманди
        Controller controllerUniversal = new Controller();
        
        Command universalOn = new MacroCommand(Arrays.asList(
                new LampOnCommand(kitchenLamp),
                new LampOnCommand(hallLamp),
                new LampOnCommand(bedroomLamp),
                new LampOnCommand(bathroomLamp)
        ));
        
        Command universalOff = new MacroCommand(Arrays.asList(
                new LampOffCommand(kitchenLamp),
                new LampOffCommand(hallLamp),
                new LampOffCommand(bedroomLamp),
                new LampOffCommand(bathroomLamp)
        ));
        
        controllerUniversal.setCommands(universalOn, universalOff);

        // Simulation
        System.out.println("--- Окремі пульти: Вмикаємо ---");
        controllerKitchenLamp.on();
        controllerHallLamp.on();
        controllerBedroomLamp.on();

        System.out.println("\n--- Окремі пульти: Вимикаємо ---");
        controllerKitchenLamp.off();
        controllerHallLamp.off();
        controllerBedroomLamp.off();

        System.out.println("\n--- Знову вмикаємо деякі ---");
        controllerBedroomLamp.on();
        controllerBathroomLamp.on();

        System.out.println("\n--- Універсальний пульт: ВИМКНУТИ ВСЕ ---");
        controllerUniversal.off();
    }
}