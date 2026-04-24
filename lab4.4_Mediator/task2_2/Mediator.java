public interface Mediator {
    void buy(String item, int quantity, Customer customer);
    boolean checkInStock(String item, int quantity);
    void deliver(String item, int quantity, Customer customer);
}