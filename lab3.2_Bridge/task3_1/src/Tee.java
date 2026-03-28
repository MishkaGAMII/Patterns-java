public abstract class Tee extends Beverage {
    public Tee(int sugar, ServingMethod servingMethod) {
        super(sugar, servingMethod);
    }

    @Override
    public void prepare() {
        servingMethod.prepareContainer();
        System.out.println("Put some tee...");
    }

    @Override
    public int cost() {
        return 7 + servingMethod.cost();
    }
}
