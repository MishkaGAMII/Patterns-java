public class EspressoShop extends CoffeeShop {
    @Override
    protected Beverage createBeverage() {
        return new Espresso();
    }
}