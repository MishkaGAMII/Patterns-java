public class Trolleybus extends Transport {
    protected Trolleybus(long cost, long usageCost) {
        super(cost, usageCost);
    }

    public void goByContactNetwork() {
        System.out.println("Trolleybus runs!");
    }
}
