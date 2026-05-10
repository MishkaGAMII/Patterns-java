public class DraftState implements State {
    @Override
    public void publish(Document document, String user) {
        if ("admin".equals(user)) {
            document.setState(new PublishedState());
        } else {
            document.setState(new ModerationState());
        }
    }

    @Override
    public void abandon(Document document, String user) {
        // У стані чернетки відміна не передбачена діаграмою
    }
}