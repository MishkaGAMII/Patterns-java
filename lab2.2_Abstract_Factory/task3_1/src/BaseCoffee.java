public abstract class BaseCoffee implements Coffee {
    private final String name;
    private final double costPrice;
    private final double sellingPrice;

    protected BaseCoffee(String name, double costPrice, double sellingPrice) {
        this.name = name;
        this.costPrice = costPrice;
        this.sellingPrice = sellingPrice;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getCostPrice() {
        return costPrice;
    }

    @Override
    public double getSellingPrice() {
        return sellingPrice;
    }
}
