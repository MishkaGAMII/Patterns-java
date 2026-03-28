public class Manager extends Employee {
    public Manager(String name, int salary) {
        super(name, salary);
    }

    @Override
    public int payExpenses() {
        System.out.println("Менеджеру " + getName() + " виплачено " + getSalary() + " грн");
        return getSalary();
    }

    @Override
    public void printStructure(String indent) {
        System.out.println(indent + "Менеджер: " + getName() + " (" + getSalary() + " грн)");
    }
}
