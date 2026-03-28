public class TakeAway implements ServingMethod {
    @Override
    public void prepareContainer() {
        System.out.println("Take a paper cup with lid...");
    }

    @Override
    public void serve(String beverageName) {
        System.out.printf("Pack %s to takeaway...%n", beverageName);
    }

    @Override
    public void drink(String beverageName) {
        System.out.printf("Drink %s on the go!%n", beverageName);
    }

    @Override
    public int cost() {
        return 3;
    }
}
