import java.util.ArrayList;
import java.util.List;

public class Department implements StoreComponent {
    private final String name;
    private final Manager head;
    private final List<StoreComponent> staff = new ArrayList<>();

    public Department(String name, Manager head) {
        this.name = name;
        this.head = head;
        staff.add(head);
    }

    public void add(StoreComponent component) {
        staff.add(component);
    }

    @Override
    public int payExpenses() {
        System.out.println("\nПочинаємо нарахування зарплати для відділу: " + name);
        int total = 0;
        for (StoreComponent component : staff) {
            total += component.payExpenses();
        }
        System.out.println("Разом по відділу \"" + name + "\": " + total + " грн");
        return total;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void printStructure(String indent) {
        System.out.println(indent + "Відділ: " + name);
        for (StoreComponent component : staff) {
            component.printStructure(indent + "  ");
        }
    }

    public Manager getHead() {
        return head;
    }
}
