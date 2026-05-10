public class OtherState implements State {
    @Override
    public void action1(Context context) {
        System.out.println("Виконання action1 у OtherState.");
    }

    @Override
    public void action2(Context context) {
        System.out.println("Виконання action2 у OtherState. Повернення до ConcreteState.");
        State state = new ConcreteState();
        context.setState(state);
    }
}