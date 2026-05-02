public class ScaleCommand implements Command {
    private Triangle triangle;
    private String action;

    public ScaleCommand(Triangle triangle, String action) {
        this.triangle = triangle;
        this.action = action;
    }

    @Override
    public void execute() {
        switch (action) {
            case "dupA" -> triangle.duplicateA();
            case "halfA" -> triangle.halfA();
            case "dupB" -> triangle.duplicateB();
            case "halfB" -> triangle.halfB();
            case "dupC" -> triangle.duplicateC();
            case "halfC" -> triangle.halfC();
        }
    }
}