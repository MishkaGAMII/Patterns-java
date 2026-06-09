public class BakingState implements OrderState {
    @Override
    public void nextState(CakeOrder order) {
        order.setState(new ReadyState());
    }

    @Override
    public void printStatus() {
        System.out.println("[Статус] Торт випікається та декорується кондитером...");
    }
}