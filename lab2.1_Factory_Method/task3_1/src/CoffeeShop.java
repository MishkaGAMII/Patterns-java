public abstract class CoffeeShop {
    protected abstract Beverage createBeverage();

    public Beverage sellOne() {
        Beverage beverage = createBeverage();
        System.out.println("Продано: " + beverage.getInfo());
        return beverage;
    }
}