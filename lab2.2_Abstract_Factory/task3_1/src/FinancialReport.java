public class FinancialReport {
    private final String manufacturerName;
    private final double machinePurchaseCost;
    private final double serviceCostForPeriod;
    private final double productionCostForPeriod;
    private final double revenueForPeriod;
    private final double profitForPeriod;
    private final int breakEvenDays;

    public FinancialReport(
            String manufacturerName,
            double machinePurchaseCost,
            double serviceCostForPeriod,
            double productionCostForPeriod,
            double revenueForPeriod,
            double profitForPeriod,
            int breakEvenDays
    ) {
        this.manufacturerName = manufacturerName;
        this.machinePurchaseCost = machinePurchaseCost;
        this.serviceCostForPeriod = serviceCostForPeriod;
        this.productionCostForPeriod = productionCostForPeriod;
        this.revenueForPeriod = revenueForPeriod;
        this.profitForPeriod = profitForPeriod;
        this.breakEvenDays = breakEvenDays;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public double getProfitForPeriod() {
        return profitForPeriod;
    }

    public boolean isProfitable() {
        return profitForPeriod > 0;
    }

    public int getBreakEvenDays() {
        return breakEvenDays;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Виробник: ").append(manufacturerName).append("\n");
        builder.append("Вартість кавомашини: ").append(machinePurchaseCost).append(" грн\n");
        builder.append("Вартість обслуговування за період: ").append(serviceCostForPeriod).append(" грн\n");
        builder.append("Собівартість напоїв за період: ").append(productionCostForPeriod).append(" грн\n");
        builder.append("Дохід за період: ").append(revenueForPeriod).append(" грн\n");
        builder.append("Прибуток за період: ").append(profitForPeriod).append(" грн\n");
        if (breakEvenDays > 0) {
            builder.append("Орієнтовна точка беззбитковості: ").append(breakEvenDays).append(" днів\n");
        } else {
            builder.append("Орієнтовна точка беззбитковості: не досягається\n");
        }
        return builder.toString();
    }
}
