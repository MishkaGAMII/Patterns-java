public class ReadyState implements OrderState {
    @Override
    public void nextState(CakeOrder order) {
        System.out.println("[Помилка] Торт вже готовий. Наступного етапу немає.");
    }

    @Override
    public void printStatus() {
        System.out.println("[Статус] Торт готовий до видачі клієнту!");
    }
}