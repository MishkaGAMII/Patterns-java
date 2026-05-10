public class Client {
    public static void main(String[] args) {
        State initialState = new ConcreteState();
        Context context = new Context(initialState);
        
        context.action1();
        context.action2();
        context.action1();
    }
}