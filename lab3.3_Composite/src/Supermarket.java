import java.util.ArrayList;
import java.util.List;

public class Supermarket implements StoreComponent {
    private final String name;
    private final Manager director;
    private final List<StoreComponent> components = new ArrayList<>();

    public Supermarket(String name, Manager director) {
        this.name = name;
        this.director = director;
        components.add(director);
    }

    public void add(StoreComponent component) {
        components.add(component);
    }

    @Override
    public int payExpenses() {
        System.out.println("Починаємо нарахування зарплати у супермаркеті \"" + name + "\"");
        int total = 0;
        for (StoreComponent component : components) {
            total += component.payExpenses();
        }
        System.out.println("\nЗагальна сума виплат по супермаркету \"" + name + "\": " + total + " грн");
        return total;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void printStructure(String indent) {
        System.out.println(indent + "Супермаркет: " + name);
        for (StoreComponent component : components) {
            component.printStructure(indent + "  ");
        }
    }

    public Manager getDirector() {
        return director;
    }
}
