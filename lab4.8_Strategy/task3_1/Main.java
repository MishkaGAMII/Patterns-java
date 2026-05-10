public class Main {

    public static void main(String[] args) {
        Customer customer = new Customer();

        customer.setPaymentStrategy(new BankAccountStrategy());
        customer.makePayment(100);

        customer.setPaymentStrategy(new PayPalStrategy());
        customer.makePayment(200);

        customer.setPaymentStrategy(new GooglePayStrategy());
        customer.makePayment(300);
    }

}