public class Main {
    public static void main(String[] args) {
        System.out.println("--- Виконання для ConcreteClassA ---");
        AbstractClass classA = new ConcreteClassA();
        classA.templateMethod();

        System.out.println("\n--- Виконання для ConcreteClassB ---");
        AbstractClass classB = new ConcreteClassB();
        classB.templateMethod();
    }
}