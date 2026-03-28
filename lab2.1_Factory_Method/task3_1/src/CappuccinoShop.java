public class CappuccinoShop extends CoffeeShop {
    @Override
    protected Beverage createBeverage() {
        return new Cappuccino();
    }
}