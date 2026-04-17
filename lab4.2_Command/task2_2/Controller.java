public class Controller {
    private Command onCommand;
    private Command offCommand;

    // Ініціалізуємо пульт командами
    public void setCommands(Command onCommand, Command offCommand) {
        this.onCommand = onCommand;
        this.offCommand = offCommand;
    }

    public void on() {
        System.out.println("Натиснуто кнопку ON");
        if (onCommand != null) {
            onCommand.execute();
        }
    }

    public void off() {
        System.out.println("Натиснуто кнопку OFF");
        if (offCommand != null) {
            offCommand.execute();
        }
    }
}