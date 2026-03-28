public class LatteShop extends CoffeeShop {
    @Override
    protected Beverage createBeverage() {
        return new Latte();
    }
}