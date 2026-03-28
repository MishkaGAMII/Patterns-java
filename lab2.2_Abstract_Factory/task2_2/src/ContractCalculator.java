public class ContractCalculator {
    private final int busesCount;
    private final int tramsCount;
    private final int trolleybusesCount;
    private final int mileage;

    public ContractCalculator(int busesCount, int tramsCount, int trolleybusesCount, int mileage) {
        this.busesCount = busesCount;
        this.tramsCount = tramsCount;
        this.trolleybusesCount = trolleybusesCount;
        this.mileage = mileage;
    }

    public long calculateContractCost(MunicipalTransportFactory factory) {
        long totalCost = 0;

        for (int i = 0; i < busesCount; i++) {
            Bus bus = factory.createBus();
            totalCost += bus.getCost() + bus.getUsageCost() * mileage;
        }

        for (int i = 0; i < tramsCount; i++) {
            Tram tram = factory.createTram();
            totalCost += tram.getCost() + tram.getUsageCost() * mileage;
        }

        for (int i = 0; i < trolleybusesCount; i++) {
            Trolleybus trolleybus = factory.createTrolleybus();
            totalCost += trolleybus.getCost() + trolleybus.getUsageCost() * mileage;
        }

        return totalCost;
    }
}
