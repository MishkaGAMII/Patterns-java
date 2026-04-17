public class Client {
    public static void main(String[] args) {
        // 1. Створюємо Одержувача (Receiver)
        Lamp lamp = new Lamp();

        // 2. Створюємо Конкретні команди
        Command lampOn = new LampOnCommand(lamp);
        Command lampOff = new LampOffCommand(lamp);

        // 3. Створюємо Ініціатора (Invoker)
        Controller controller = new Controller();
        
        // 4. Налаштовуємо пульт
        controller.setCommands(lampOn, lampOff);

        // 5. Симуляція роботи
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