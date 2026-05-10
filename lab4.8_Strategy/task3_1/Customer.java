public class Customer {

    private PaymentStrategy strategy;

    public void setPaymentStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public void makePayment(int amount) {
        if (strategy != null) {
            strategy.pay(amount);
        } else {
            System.out.println("Payment method is not selected.");
        }
    }

}