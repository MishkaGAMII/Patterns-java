public class Main {

    public static void main(String[] args) {
        CoffeeShop[] shops = {
                new EspressoShop(),
                new AmericanoShop(),
                new CappuccinoShop(),
                new LatteShop(),
                new MochaShop(),
                new FlatWhiteShop()
        };

        int[] soldCounts = {
                18, // Espresso
                14, // Americano
                12, // Cappuccino
                10, // Latte
                7,  // Mocha
                9   // Flat White
        };

        double totalRevenue = 0.0;
        double totalCost = 0.0;
        double totalProfit = 0.0;

        System.out.println("=== Симуляція роботи кав'ярні ===");

        for (int i = 0; i < shops.length; i++) {
            for (int j = 0; j < soldCounts[i]; j++) {
                Beverage beverage = shops[i].sellOne();
                totalRevenue += beverage.getSalePrice();
                totalCost += beverage.getCostPrice();
                totalProfit += beverage.getProfit();
            }
        }

        System.out.println();
        System.out.printf("Загальна виручка: %.2f%n", totalRevenue);
        System.out.printf("Загальна собівартість: %.2f%n", totalCost);
        System.out.printf("Загальний прибуток: %.2f%n", totalProfit);
    }
}