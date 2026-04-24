public class Client {
    public static void main(String[] args) {
        Lamp lamp = new Lamp();

        Command lampOn = new LampOnCommand(lamp);
        Command lampOff = new LampOffCommand(lamp);

        Controller controller = new Controller();
        
        controller.setCommands(lampOn, lampOff);

        System.out.println("--- Симуляція пульта ---");
        controller.on();
        controller.on();
        controller.off();
        controller.off();
        controller.on();
        controller.on();
        controller.off();
    }
}