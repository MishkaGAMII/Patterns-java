public class Whip extends BeverageDecorator {

    public Whip(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String description() {
        return beverage.description() + ", whip";
    }

    @Override
    public float cost() {
        return beverage.cost() + 0.30f;
    }
}
