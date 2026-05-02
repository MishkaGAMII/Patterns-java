public class Originator {
    private String state = "";

    public void printState() {
        System.out.println("Поточний стан: '" + state + "'");
    }

    public void updateState(String toUpdate) {
        this.state += toUpdate;
    }

    // Створення знімка поточного стану
    public Memento save() {
        return new MementoImpl(state);
    }

    // Відновлення стану зі знімка
    public void restore(Memento memento) {
        if (memento instanceof MementoImpl) {
            this.state = ((MementoImpl) memento).getState();
        }
    }

    // Приватний внутрішній клас для збереження стану
    private static class MementoImpl implements Memento {
        private final String state;

        private MementoImpl(String state) {
            this.state = state;
        }

        private String getState() {
            return state;
        }
    }
}