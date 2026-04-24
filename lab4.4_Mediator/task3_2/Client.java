public class Client {

    public static void main(String[] args) {
        ChatMediator chat = new ConcreteChatMediator();

        // Створюємо користувачів з різними ролями та додаємо до них посилання на чат
        ConcreteUser admin1 = new ConcreteUser("Admin1", "Admins", chat);
        ConcreteUser mod1 = new ConcreteUser("Moderator1", "Moderators", chat);
        ConcreteUser user1 = new ConcreteUser("User1", "RegularUsers", chat);
        ConcreteUser user2 = new ConcreteUser("User2", "RegularUsers", chat);

        // Реєструємо користувачів у посереднику (чаті)
        chat.addUser(admin1);
        chat.addUser(mod1);
        chat.addUser(user1);
        chat.addUser(user2);

        System.out.println("--- Тест 1: Розсилка всім ---");
        user1.sendMessageAll("Привіт всім!");

        System.out.println("\n--- Тест 2: Приватне повідомлення ---");
        user2.sendMessage("Привіт, я маю питання.", "Moderator1");

        System.out.println("\n--- Тест 3: Розсилка конкретній групі ---");
        admin1.sendMessageToGroup("Увага! Сервер буде перезавантажено через 5 хвилин.", "RegularUsers");
        
        System.out.println("\n--- Тест 4: Розсилка модераторам ---");
        admin1.sendMessageToGroup("Перевірте повідомлення від User2.", "Moderators");
    }
}