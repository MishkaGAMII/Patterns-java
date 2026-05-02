import java.util.Stack;

public class Caretaker {
    private final Stack<Originator.Memento> history = new Stack<>();
    private final Originator originator;

    public Caretaker(Originator originator) {
        this.originator = originator;
    }

    // Збереження знімка перед зміною
    public void backup() {
        history.push(originator.save());
    }

    // Відновлення попереднього знімка
    public void undo() {
        if (!history.isEmpty()) {
            originator.restore(history.pop());
        }
    }
}