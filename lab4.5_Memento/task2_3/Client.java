import java.util.Stack;

public class Client {
    public static void main(String[] args) {
        final Originator originator = new Originator();
        final Stack<Memento> history = new Stack<>();

        // 1. Зберігаємо початковий (порожній) стан
        history.push(originator.save());

        // 2. Додаємо текст і зберігаємо
        originator.updateState("Hello");
        history.push(originator.save());

        originator.updateState(", ");
        history.push(originator.save());

        originator.updateState("World");
        history.push(originator.save());

        // 3. Фінальна зміна без збереження
        originator.updateState("!");
        System.out.print("Перед скасуванням: ");
        originator.printState();

        System.out.println("\n--- Виконуємо серію UNDO ---");

        // Скасування до "Hello, World"
        if (!history.isEmpty()) originator.restore(history.pop());
        originator.printState();

        // Скасування до "Hello, "
        if (!history.isEmpty()) originator.restore(history.pop());
        originator.printState();

        // Скасування до "Hello"
        if (!history.isEmpty()) originator.restore(history.pop());
        originator.printState();

        // Скасування до порожнього рядка
        if (!history.isEmpty()) originator.restore(history.pop());
        originator.printState();

        // Перевірка на випадок порожнього стеку
        if (!history.isEmpty()) {
            originator.restore(history.pop());
        } else {
            System.out.println("Історія порожня, більше скасувань неможливо.");
        }
    }
}