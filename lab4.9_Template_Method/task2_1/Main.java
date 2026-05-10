public class Main {

    public static void main(String[] args) {
        System.out.println("--- Виготовлення вегетаріанської піци ---");
        Pizza vegPizza = new VegetarianPizza();
        vegPizza.makePizza();

        System.out.println("\n--- Виготовлення піци з шинкою ---");
        Pizza meatPizza = new MeatPizza();
        meatPizza.makePizza();
    }
}