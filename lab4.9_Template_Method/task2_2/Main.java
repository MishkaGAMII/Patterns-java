public class Main {

    public static void main(String[] args) {
        System.out.println("Виготовлення вегетаріанської піци:");
        PizzaMaker vegPizza = new VegetarianPizza();
        vegPizza.makePizza();

        System.out.println("\nВиготовлення піци з шинкою:");
        PizzaMaker hamPizza = new HamPizza();
        hamPizza.makePizza();
    }

}