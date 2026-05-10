public class GooglePayStrategy implements PaymentStrategy {
    @Override
    public void pay(int amount) {
        System.out.println("Payment of $" + amount + " made from Google Pay.");
    }
}