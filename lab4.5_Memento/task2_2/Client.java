public class Client {

    public static void main(String[] args) {
        final Originator originator = new Originator();
        final Caretaker caretaker = new Caretaker();

        // Зберігаємо початковий стан (порожній рядок)
        caretaker.save(originator);

        originator.updateState("Hello");
        caretaker.save(originator);
        
        originator.updateState(", ");
        caretaker.save(originator);
        
        originator.updateState("World");
        caretaker.save(originator);
        
        originator.updateState("!");
        originator.printState(); // Виведе: Hello, World!

        System.out.print("Undo 1: ");
        caretaker.undo(originator);
        originator.printState(); // Виведе стан до "!"

        System.out.print("Undo 2: ");
        caretaker.undo(originator);
        originator.printState(); // Виведе стан до "World"

        System.out.print("Undo 3: ");
        caretaker.undo(originator);
        originator.printState(); // Виведе стан до ", "

        System.out.print("Undo 4: ");
        caretaker.undo(originator);
        originator.printState(); // Виведе стан до "Hello"

        System.out.print("Undo 5 (Back to empty): ");
        caretaker.undo(originator);
        originator.printState(); // Виведе порожній рядок
    }
}