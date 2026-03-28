public abstract class BaseCoffeeMachine implements CoffeeMachine {
    private final String manufacturerName;
    private final double purchaseCost;
    private final double dailyServiceCost;

    protected BaseCoffeeMachine(String manufacturerName, double purchaseCost, double dailyServiceCost) {
        this.manufacturerName = manufacturerName;
        this.purchaseCost = purchaseCost;
        this.dailyServiceCost = dailyServiceCost;
    }

    @Override
    public String getManufacturerName() {
        return manufacturerName;
    }

    @Override
    public double getPurchaseCost() {
        return purchaseCost;
    }

    @Override
    public double getDailyServiceCost() {
        return dailyServiceCost;
    }
}
