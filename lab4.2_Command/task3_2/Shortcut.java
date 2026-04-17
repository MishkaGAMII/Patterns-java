public class Shortcut {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void press() {
        if (command != null) {
            command.execute();
        }
    }
}