public abstract class PizzaMaker {

    public final void makePizza() {
        prepareDough();
        addSauce();
        addToppings();
        bake();
    }

    private void prepareDough() {
        System.out.println("Підготовка тіста...");
    }

    private void addSauce() {
        System.out.println("Додавання томатного соусу...");
    }

    protected abstract void addToppings();

    private void bake() {
        System.out.println("Випікання піци...");
    }
}