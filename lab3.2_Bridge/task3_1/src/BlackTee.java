public class BlackTee extends Tee {

    private final int water_volume;

    public BlackTee(int sugar, int water_volume, ServingMethod servingMethod) {
        super(sugar, servingMethod);
        this.water_volume = water_volume;
    }

    @Override
    public void drink() {
        servingMethod.drink("black tee");
    }

    @Override
    public void prepare() {
        super.prepare();
        System.out.printf("Put some hot watter: %s ml...%n", water_volume);
        if (sugar > 0) {
            System.out.printf("Put some sugar     : %s pieces ...%n", sugar);
        }
        servingMethod.serve("black tee");
    }

    @Override
    public int cost() {
        return super.cost();
    }
}
