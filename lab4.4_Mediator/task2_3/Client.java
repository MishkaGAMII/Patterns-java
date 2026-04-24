public class Client {

    public static void main(String[] args) {
        ChatMediator chat = new ConcreteChatMediator();

        User user1 = new ConcreteUser("User1", chat);
        User user2 = new ConcreteUser("User2", chat);
        User user3 = new ConcreteUser("User3", chat);
        User user4 = new ConcreteUser("User4", chat);

        chat.addUser(user1);
        chat.addUser(user2);
        chat.addUser(user3);
        chat.addUser(user4);

        user1.sendMessageAll("Hello, world!");
        
        System.out.println("-------------------");

        user2.sendMessage("Hello!", "User1");
        
        System.out.println("-------------------");
        
        user3.sendMessage("Ти тут?", "User99");
    }
}