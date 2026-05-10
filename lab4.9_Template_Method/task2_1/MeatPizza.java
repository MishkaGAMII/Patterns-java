public class MeatPizza extends Pizza {

    @Override
    protected void addSauce() {
        System.out.println("Додаємо часниковий соус...");
    }

    @Override
    protected void addToppings() {
        System.out.println("Додаємо шинку, салямі, бекон та сир...");
    }
}