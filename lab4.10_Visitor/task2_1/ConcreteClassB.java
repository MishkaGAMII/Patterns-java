public class ConcreteClassB extends AbstractClass {
    @Override
    protected void step1() {
        System.out.println("ConcreteClassB: виконання кроку 1 (інша логіка)");
    }

    @Override
    protected void step2() {
        System.out.println("ConcreteClassB: виконання кроку 2 (інша логіка)");
    }

    @Override
    protected void hook() {
        System.out.println("ConcreteClassB: перевизначений hook(), додано нову поведінку");
    }
}