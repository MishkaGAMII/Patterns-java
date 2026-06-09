public class CakeOrder {
    private CakeComponent cake;
    private OrderState state;

    public CakeOrder(CakeComponent cake) {
        this.cake = cake;
        this.state = new NewOrderState(); // Початковий стан за замовчуванням
    }

    public void setState(OrderState state) {
        this.state = state;
    }

    public void proceedToNextState() {
        state.nextState(this);
    }

    public void printOrderStatus() {
        state.printStatus();
    }

    public void printReceipt() {
        System.out.println("=== ЧЕК ЗАМОВЛЕННЯ ===");
        System.out.println("Склад: " + cake.getDescription());
        System.out.println("До оплати: " + cake.getPrice() + " грн.");
        System.out.println("======================");
    }
}