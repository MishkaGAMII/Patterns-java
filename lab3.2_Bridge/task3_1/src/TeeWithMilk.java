public class TeeWithMilk extends Tee {

    private final int milkVolume;

    public TeeWithMilk(int sugar, int milkVolume, ServingMethod servingMethod) {
        super(sugar, servingMethod);
        this.milkVolume = milkVolume;
    }

    @Override
    public void drink() {
        servingMethod.drink("tee with milk");
    }

    @Override
    public void prepare() {
        super.prepare();
        System.out.printf("Put some milk      : %s ml...%n", milkVolume);
        if (sugar > 0) {
            System.out.printf("Put some sugar     : %s pieces ...%n", sugar);
        }
        servingMethod.serve("tee with milk");
    }

    @Override
    public int cost() {
        return super.cost() + (int) (milkVolume / 20.0);
    }
}
