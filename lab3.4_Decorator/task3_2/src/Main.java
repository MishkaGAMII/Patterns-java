public class Main {

    public static void main(String[] args) {
        Beverage beverage1 = new Sugar(new Sugar(new Espresso()));
        System.out.println(beverage1);

        Beverage beverage2 = new Sugar(new Sugar(new Whip(new DarkRoast())));
        System.out.println(beverage2);

        Beverage beverage3 = new Sugar(new Cream(new DarkRoast()));
        System.out.println(beverage3);

        Beverage beverage4 = new Sugar(new Sugar(new Milk(new Decaf())));
        System.out.println(beverage4);
    }
}
