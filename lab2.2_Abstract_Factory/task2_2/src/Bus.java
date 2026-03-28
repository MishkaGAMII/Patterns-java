public class Bus extends Transport {
    protected Bus(long cost, long usageCost) {
        super(cost, usageCost);
    }

    public void goByWay() {
        System.out.println("Bus runs!");
    }
}
