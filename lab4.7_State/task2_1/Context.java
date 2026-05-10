public class Context {
    private State state;

    public Context(State initialState) {
        this.state = initialState;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void action1() {
        if (state != null) {
            state.action1(this);
        }
    }

    public void action2() {
        if (state != null) {
            state.action2(this);
        }
    }
}