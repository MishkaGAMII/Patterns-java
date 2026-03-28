public class Salesperson extends Employee {
    public Salesperson(String name, int salary) {
        super(name, salary);
    }

    @Override
    public int payExpenses() {
        System.out.println("Продавцю " + getName() + " виплачено " + getSalary() + " грн");
        return getSalary();
    }

    @Override
    public void printStructure(String indent) {
        System.out.println(indent + "Продавець: " + getName() + " (" + getSalary() + " грн)");
    }
}
