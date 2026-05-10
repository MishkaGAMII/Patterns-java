public class PublishedState implements State {
    @Override
    public void publish(Document document, String user) {
        // Документ вже опублікований
    }

    @Override
    public void abandon(Document document, String user) {
        document.setState(new DraftState());
    }
}