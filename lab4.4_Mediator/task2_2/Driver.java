public class Driver {
    private final Mediator mediator;

    public Driver(Mediator mediator) {
        this.mediator = mediator;
    }

    public void deliver(String item, int quantity, Customer customer) {
        System.out.println(quantity + " " + item + " out for delivery to " + customer.getAddress());
    }
}