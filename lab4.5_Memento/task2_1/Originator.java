public class Originator {
    private String state = ""; //[cite: 3]

    public void printState() {
        System.out.println(state); //[cite: 3]
    }

    public void updateState(String toUpdate) {
        this.state += toUpdate; //[cite: 3]
    }

    // Збереження поточного стану
    public Memento save() {
        return new Memento(this.state);
    }

    // Відновлення стану зі знімка
    public void restore(Memento memento) {
        this.state = memento.getState();
    }

    // Внутрішній клас знімка (інкапсульований)
    public static class Memento {
        private final String state;

        private Memento(String state) {
            this.state = state;
        }

        private String getState() {
            return state;
        }
    }
}