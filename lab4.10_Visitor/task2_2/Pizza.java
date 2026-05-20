public abstract class Pizza {
    public final void printInstructions() {
        makeBase();
        addToppings();
        cook();
        System.out.println();
    }

    private void makeBase() {
        System.out.println("Mix flour, yeast and salt");
        System.out.println("Roll out the dough");
    }

    protected abstract void addToppings();

    protected void cook() {
        System.out.println("Cook in the oven for 15 minutes");
    }
}