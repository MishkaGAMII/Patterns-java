public class Tram extends Transport {
    protected Tram(long cost, long usageCost) {
        super(cost, usageCost);
    }

    public void goByRails() {
        System.out.println("Tram runs!");
    }
}
