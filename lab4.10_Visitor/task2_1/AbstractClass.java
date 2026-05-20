public abstract class AbstractClass {
    
    public final void templateMethod() {
        step1();
        step2();
        hook();
    }

    protected abstract void step1();
    protected abstract void step2();

    protected void hook() {
    }
}