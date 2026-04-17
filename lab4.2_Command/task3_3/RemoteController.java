public class RemoteController {
    private Command onCommand;
    private Command offCommand;
    // For a real remote, we would have buttons/commands for volume and channels too

    public void setOnCommand(Command onCommand) {
        this.onCommand = onCommand;
    }

    public void setOffCommand(Command offCommand) {
        this.offCommand = offCommand;
    }

    public void deviceOn() {
        if (onCommand != null) onCommand.execute();
    }

    public void deviceOff() {
        if (offCommand != null) offCommand.execute();
    }
}