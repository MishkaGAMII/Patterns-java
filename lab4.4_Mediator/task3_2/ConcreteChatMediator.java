import java.util.HashMap;
import java.util.Map;

public class ConcreteChatMediator implements ChatMediator {
    private Map<String, ConcreteUser> users = new HashMap<>();

    @Override
    public void addUser(ConcreteUser user) {
        users.put(user.getUserId(), user);
    }

    @Override
    public void sendMessageAll(String message, String userFromId) {
        for (ConcreteUser user : users.values()) {
            // Не надсилаємо повідомлення самому собі
            if (!user.getUserId().equals(userFromId)) {
                user.receiveMessage(message, userFromId);
            }
        }
    }

    @Override
    public void sendMessage(String message, String userFromId, String userToId) {
        ConcreteUser user = users.get(userToId);
        if (user != null) {
            user.receiveMessage(message, userFromId);
        } else {
            System.out.println("User " + userToId + " not found.");
        }
    }

    @Override
    public void sendMessageToGroup(String message, String userFromId, String groupTo) {
        for (ConcreteUser user : users.values()) {
            // Надсилаємо тільки учасникам відповідної групи (не відправляючи самому собі)
            if (!user.getUserId().equals(userFromId) && user.getGroup().equals(groupTo)) {
                user.receiveMessage(message, userFromId);
            }
        }
    }
}