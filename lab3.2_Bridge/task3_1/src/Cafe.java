public class Cafe {

    public static void main(String[] args) {
        ServingMethod inRestaurant = new InRestaurant();
        ServingMethod takeAway = new TakeAway();

        Beverage[] beverages = {
                new BlackChocolate(3, 200, inRestaurant),
                new BlackCoffee(3, 200, true, inRestaurant),
                new BlackTee(0, 300, takeAway),
                new MilkChocolate(3, 200, takeAway),
                new CoffeeWithMilk(3, 200, inRestaurant),
                new TeeWithMilk(2, 300, takeAway)
        };

        for (Beverage beverage : beverages) {
            beverageInfo(beverage);
        }
    }

    private static void beverageInfo(Beverage beverage) {
        System.out.println("=========================");
        beverage.prepare();
        System.out.printf("Cost of beverage: %s grn%n", beverage.cost());
        beverage.drink();
    }
}
