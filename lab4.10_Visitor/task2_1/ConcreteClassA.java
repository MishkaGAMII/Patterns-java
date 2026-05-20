public class ConcreteClassA extends AbstractClass {
    @Override
    protected void step1() {
        System.out.println("ConcreteClassA: виконання унікального кроку 1");
    }

    @Override
    protected void step2() {
        System.out.println("ConcreteClassA: виконання унікального кроку 2");
    }
}