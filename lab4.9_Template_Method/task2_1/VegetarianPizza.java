public class VegetarianPizza extends Pizza {

    @Override
    protected void addSauce() {
        System.out.println("Додаємо класичний томатний соус...");
    }

    @Override
    protected void addToppings() {
        System.out.println("Додаємо гриби, перець, помідори, оливки та сир...");
    }
}