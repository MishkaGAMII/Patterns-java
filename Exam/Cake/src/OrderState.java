public interface OrderState {
    void nextState(CakeOrder order);
    void printStatus();
}