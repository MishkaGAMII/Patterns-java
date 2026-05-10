public class Calculator {

    private OperationStrategy strategy;

    public void setStrategy(OperationStrategy strategy) {
        this.strategy = strategy;
    }

    public int executeOperation(int a, int b) {
        if (strategy != null) {
            return strategy.execute(a, b);
        } else {
            System.out.println("Стратегія не вибрана");
            return 0;
        }
    }

}