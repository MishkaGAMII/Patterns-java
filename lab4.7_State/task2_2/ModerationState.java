public class ModerationState implements State {
    @Override
    public void publish(Document document, String user) {
        document.setState(new PublishedState());
    }

    @Override
    public void abandon(Document document, String user) {
        document.setState(new DraftState());
    }
}