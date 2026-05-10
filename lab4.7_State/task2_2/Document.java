public class Document {
    private State state;
    private String text = "";

    public Document() {
        this.state = new DraftState();
    }

    public void setState(State state) {
        this.state = state;
    }

    public void publish(String user) {
        state.publish(this, user);
    }

    public void abandon(String user) {
        state.abandon(this, user);
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}