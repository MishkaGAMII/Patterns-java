public abstract class Pizza {

    // Шаблонний метод
    public final void makePizza() {
        prepareDough();
        addSauce();
        addToppings();
        bake();
    }

    private void prepareDough() {
        System.out.println("Готуємо тісто...");
    }

    protected abstract void addSauce();
    
    protected abstract void addToppings();

    private void bake() {
        System.out.println("Випікаємо піцу при 220 градусах...");
    }
}