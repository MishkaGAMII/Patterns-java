public class Client {

    public static void main(String[] args) {
        // 1. Створюємо посередника
        Mediator broker = new MessageBroker();

        // 2. Створюємо елементи системи
        Component element1 = new SystemElement("Сенсор температури");
        Component element2 = new SystemElement("База даних");
        Component element3 = new SystemElement("Панель керування");

        // 3. Реєструємо елементи у посереднику
        broker.registerComponent(element1);
        broker.registerComponent(element2);
        broker.registerComponent(element3);

        // 4. Демонстрація обміну повідомленнями
        System.out.println("--- Перша подія ---");
        element1.send("Зафіксовано критичне підвищення температури!");

        System.out.println("\n--- Друга подія ---");
        element3.send("Запит на оновлення даних на екрані...");
    }

}