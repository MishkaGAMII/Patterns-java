public class CoffeeShopAnalytics {
    public FinancialReport analyze(CoffeeMachineFactory factory, DailySalesPlan dailySalesPlan, int days) {
        CoffeeMachine coffeeMachine = factory.createCoffeeMachine();
        Coffee espresso = factory.createEspresso();
        Coffee americano = factory.createAmericano();
        Coffee cappuccino = factory.createCappuccino();
        Coffee latte = factory.createLatte();

        double dailyRevenue =
                espresso.getSellingPrice() * dailySalesPlan.getEspressoCount() +
                americano.getSellingPrice() * dailySalesPlan.getAmericanoCount() +
                cappuccino.getSellingPrice() * dailySalesPlan.getCappuccinoCount() +
                latte.getSellingPrice() * dailySalesPlan.getLatteCount();

        double dailyProductionCost =
                espresso.getCostPrice() * dailySalesPlan.getEspressoCount() +
                americano.getCostPrice() * dailySalesPlan.getAmericanoCount() +
                cappuccino.getCostPrice() * dailySalesPlan.getCappuccinoCount() +
                latte.getCostPrice() * dailySalesPlan.getLatteCount();

        double revenueForPeriod = dailyRevenue * days;
        double productionCostForPeriod = dailyProductionCost * days;
        double serviceCostForPeriod = coffeeMachine.getDailyServiceCost() * days;
        double profitForPeriod = revenueForPeriod
                - productionCostForPeriod
                - serviceCostForPeriod
                - coffeeMachine.getPurchaseCost();

        double dailyNetProfit = dailyRevenue - dailyProductionCost - coffeeMachine.getDailyServiceCost();
        int breakEvenDays = 0;
        if (dailyNetProfit > 0) {
            breakEvenDays = (int) Math.ceil(coffeeMachine.getPurchaseCost() / dailyNetProfit);
        }

        return new FinancialReport(
                coffeeMachine.getManufacturerName(),
                coffeeMachine.getPurchaseCost(),
                serviceCostForPeriod,
                productionCostForPeriod,
                revenueForPeriod,
                profitForPeriod,
                breakEvenDays
        );
    }
}
