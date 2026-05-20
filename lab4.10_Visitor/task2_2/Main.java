public class Main {
    public static void main(String[] args) {
        Pizza vegetarian = new VegetarianPizza();
        vegetarian.printInstructions();

        Pizza meatFeast = new MeatFeastPizza();
        meatFeast.printInstructions();
    }
}