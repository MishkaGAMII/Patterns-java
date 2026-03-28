public abstract class Coffee extends Beverage {
    public Coffee(int sugar, ServingMethod servingMethod) {
        super(sugar, servingMethod);
    }

    @Override
    public void prepare() {
        servingMethod.prepareContainer();
        System.out.println("Put some coffee...");
    }

    @Override
    public int cost() {
        return 10 + servingMethod.cost();
    }
}
