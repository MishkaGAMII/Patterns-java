public class ConcreteState implements State {
    @Override
    public void action1(Context context) {
        System.out.println("Виконання action1 у ConcreteState. Перехід до OtherState.");
        State state = new OtherState();
        context.setState(state);
    }

    @Override
    public void action2(Context context) {
        System.out.println("Виконання action2 у ConcreteState.");
    }
}