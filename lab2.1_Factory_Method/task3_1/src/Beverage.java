public abstract class Beverage {
    private final String name;
    private final double costPrice;
    private final double salePrice;

    protected Beverage(String name, double costPrice, double salePrice) {
        this.name = name;
        this.costPrice = costPrice;
        this.salePrice = salePrice;
    }

    public String getName() {
        return name;
    }

    public double getCostPrice() {
        return costPrice;
    }

    public double getSalePrice() {
        return salePrice;
    }

    public double getProfit() {
        return salePrice - costPrice;
    }

    public String getInfo() {
        return String.format(
                "%s | собівартість: %.2f | ціна продажу: %.2f | прибуток: %.2f",
                name, costPrice, salePrice, getProfit()
        );
    }
}