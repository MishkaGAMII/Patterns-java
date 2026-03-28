public abstract class Chocolate extends Beverage {
    public Chocolate(int sugar, ServingMethod servingMethod) {
        super(sugar, servingMethod);
    }

    @Override
    public void prepare() {
        servingMethod.prepareContainer();
        System.out.println("Put some cacao...");
    }

    @Override
    public int cost() {
        return 15 + servingMethod.cost();
    }
}
