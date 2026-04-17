import java.util.List;

public class UniversalOffCommand implements Command {
    private final List<Command> turnOffCommands;

    public UniversalOffCommand(List<Command> turnOffCommands) {
        this.turnOffCommands = turnOffCommands;
    }

    @Override
    public void execute() {
        System.out.println("--- Universal Remote: Turning OFF all devices in the system ---");
        for (Command cmd : turnOffCommands) {
            cmd.execute();
        }
    }
}