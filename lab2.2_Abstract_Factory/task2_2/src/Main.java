public class Main {
    public static void main(String[] args) {
        final int A = 10;       // закупити A автобусів
        final int T = 5;        // закупити T трамваїв
        final int Tr = 40;      // закупити Tr – тролейбусів
        final int N = 200_000;  // орієнтовний пробіг експлуатації

        ContractCalculator calculator = new ContractCalculator(A, T, Tr, N);

        MunicipalTransportFactory[] factories = {
                new VolvoFactory(),
                new SkodaFactory(),
                new HyundaiFactory()
        };

        MunicipalTransportFactory bestFactory = null;
        long minCost = Long.MAX_VALUE;

        for (MunicipalTransportFactory factory : factories) {
            long contractCost = calculator.calculateContractCost(factory);
            System.out.println(factory.getManufacturerName() + ": " + contractCost + " грн");

            if (contractCost < minCost) {
                minCost = contractCost;
                bestFactory = factory;
            }
        }

        System.out.println();
        System.out.println("Найвигідніший контракт: " + bestFactory.getManufacturerName());
        System.out.println("Загальна вартість: " + minCost + " грн");
    }
}
