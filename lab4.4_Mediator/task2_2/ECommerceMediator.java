public class ECommerceMediator implements Mediator {
    private ECommerceSite site;
    private Driver driver;

    public void setSite(ECommerceSite site) {
        this.site = site;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    @Override
    public void buy(String item, int quantity, Customer customer) {
        if (site.checkInStock(item, quantity)) {
            site.sell(item, quantity);
            this.deliver(item, quantity, customer);
        } else {
            System.out.println("Товар " + item + " відсутній у потрібній кількості.");
        }
    }

    @Override
    public boolean checkInStock(String item, int quantity) {
        return site.checkInStock(item, quantity);
    }

    @Override
    public void deliver(String item, int quantity, Customer customer) {
        driver.deliver(item, quantity, customer);
    }
}