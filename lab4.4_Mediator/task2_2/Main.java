public class Main {
    public static void main(String[] args) {
        // Створюємо посередника
        ECommerceMediator mediator = new ECommerceMediator();

        // Створюємо компоненти, передаючи їм посередника
        ECommerceSite site = new ECommerceSite(mediator);
        Driver driver = new Driver(mediator);
        
        // Реєструємо компоненти в посереднику
        mediator.setSite(site);
        mediator.setDriver(driver);

        // Створюємо покупця
        Customer customer = new Customer("123 Sunny Street", mediator);

        // Виконання замовлення
        customer.buy("pens", 3);
        customer.buy("pencils", 10);
    }
}