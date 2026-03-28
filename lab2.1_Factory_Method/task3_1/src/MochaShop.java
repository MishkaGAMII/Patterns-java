public class MochaShop extends CoffeeShop {
    @Override
    protected Beverage createBeverage() {
        return new Mocha();
    }
}