public class SetSideCommand implements Command {
    private Triangle triangle;
    private String side;
    private float value;

    public SetSideCommand(Triangle triangle, String side, float value) {
        this.triangle = triangle;
        this.side = side;
        this.value = value;
    }

    @Override
    public void execute() {
        switch (side.toLowerCase()) {
            case "a" -> triangle.setA(value);
            case "b" -> triangle.setB(value);
            case "c" -> triangle.setC(value);
        }
    }
}