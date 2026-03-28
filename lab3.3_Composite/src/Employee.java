public abstract class Employee implements StoreComponent {
    private final String name;
    private final int salary;

    protected Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }
}
