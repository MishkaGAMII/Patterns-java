public class Context {

    private Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void doSomething() {
        if (strategy != null) {
            strategy.execute();
        }
    }

}