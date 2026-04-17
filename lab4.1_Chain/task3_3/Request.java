public class Request {
    public enum Operation {
        ADD, SUBTRACT, MULTIPLY, DIVIDE
    }

    private final double number1;
    private final double number2;
    private final Operation operation;

    public Request(double number1, double number2, Operation operation) {
        this.number1 = number1;
        this.number2 = number2;
        this.operation = operation;
    }

    public double getNumber1() { return number1; }
    public double getNumber2() { return number2; }
    public Operation getOperation() { return operation; }
}