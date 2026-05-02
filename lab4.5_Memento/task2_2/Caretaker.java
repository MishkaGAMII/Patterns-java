import java.util.Stack;

public class Caretaker {
    private final Stack<Memento> history = new Stack<>();

    public void save(Originator originator) {
        history.push(originator.save());
    }

    public void undo(Originator originator) {
        if (!history.isEmpty()) {
            originator.restore(history.pop());
        }
    }
}