public class Originator {
    private String state = "";

    public void printState() {
        System.out.println(state);
    }

    public void updateState(String toUpdate) {
        this.state += toUpdate;
    }

    // Створення знімка
    public Memento save() {
        return new ConcreteMemento(state);
    }

    // Відновлення стану зі знімка
    public void restore(Memento memento) {
        if (memento instanceof ConcreteMemento) {
            this.state = ((ConcreteMemento) memento).getState();
        }
    }

    // Внутрішній клас, що зберігає стан
    private static class ConcreteMemento implements Memento {
        private final String state;

        private ConcreteMemento(String state) {
            this.state = state;
        }

        private String getState() {
            return state;
        }
    }
}