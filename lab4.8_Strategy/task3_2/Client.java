public class Client {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        calculator.setStrategy(new AddStrategy());
        calculator.executeOperation(12, 13);

        calculator.setStrategy(new SubtractStrategy());
        calculator.executeOperation(12, 13);

        calculator.setStrategy(new MultiplyStrategy());
        calculator.executeOperation(12, 13);
    }

}