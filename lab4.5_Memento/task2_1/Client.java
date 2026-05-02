public class Client {

    public static void main(String[] args) {
        final Originator originator = new Originator(); //[cite: 2]
        final Caretaker caretaker = new Caretaker(originator);

        caretaker.backup();
        originator.updateState("Hello"); //[cite: 2]

        caretaker.backup();
        originator.updateState(", "); //[cite: 2]

        caretaker.backup();
        originator.updateState("World"); //[cite: 2]

        caretaker.backup();
        originator.updateState("!"); //[cite: 2]
        
        originator.printState(); //[cite: 2]

        caretaker.undo();
        originator.printState(); //[cite: 2]

        caretaker.undo();
        originator.printState(); //[cite: 2]

        caretaker.undo();
        originator.printState(); //[cite: 2]

        caretaker.undo();
        originator.printState(); //[cite: 2]

        caretaker.undo();
        originator.printState(); //[cite: 2]
    }
}