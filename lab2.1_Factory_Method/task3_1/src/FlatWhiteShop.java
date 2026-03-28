public class FlatWhiteShop extends CoffeeShop {
    @Override
    protected Beverage createBeverage() {
        return new FlatWhite();
    }
}