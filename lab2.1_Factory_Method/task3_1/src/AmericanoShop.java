public class AmericanoShop extends CoffeeShop {
    @Override
    protected Beverage createBeverage() {
        return new Americano();
    }
}