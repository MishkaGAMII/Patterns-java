public class NewOrderState implements OrderState {
    @Override
    public void nextState(CakeOrder order) {
        order.setState(new BakingState());
    }

    @Override
    public void printStatus() {
        System.out.println("[Статус] Замовлення прийнято. Очікує на випікання.");
    }
}