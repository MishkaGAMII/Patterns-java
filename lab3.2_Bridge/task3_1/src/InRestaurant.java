public class InRestaurant implements ServingMethod {
    @Override
    public void prepareContainer() {
        System.out.println("Take a ceramic cup...");
    }

    @Override
    public void serve(String beverageName) {
        System.out.printf("Serve %s in the restaurant...%n", beverageName);
    }

    @Override
    public void drink(String beverageName) {
        System.out.printf("Drink %s in the restaurant!%n", beverageName);
    }

    @Override
    public int cost() {
        return 0;
    }
}
