public class Main {
    public static void main(String[] args) {
        System.out.println("=== Кондитерська: Оформлення Торта ===\n");

        // 1. Створюємо базовий торт за допомогою Builder
        CakeComponent myCake = new CakeBuilder()
                .setFlavor("Шоколадно-вишневий")
                .setLayers(3)
                .setCream("Крем-чіз")
                .build();

        // 2. Додаємо декорації за допомогою Decorator (обгортаємо об'єкти)
        myCake = new CandlesDecorator(myCake, 23);
        myCake = new MessageDecorator(myCake, "З Днем Народження!");

        // 3. Створюємо замовлення (Context для State)
        CakeOrder order = new CakeOrder(myCake);
        
        // Виводимо підсумковий чек
        order.printReceipt();
        System.out.println();

        // 4. Демонстрація зміни станів (State)
        order.printOrderStatus();     // Стан: Нове
        
        order.proceedToNextState();
        order.printOrderStatus();     // Стан: Випікається
        
        order.proceedToNextState();
        order.printOrderStatus();     // Стан: Готово
    }
}