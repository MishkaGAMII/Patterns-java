import java.util.HashMap;
import java.util.Map;

public class ConcreteChatMediator implements ChatMediator {
    private final Map<String, User> users = new HashMap<>();

    @Override
    public void addUser(User user) {
        users.put(user.getUserId(), user);
    }

    @Override
    public void sendMessage(String message, String userTo, User sender) {
        User recipient = users.get(userTo);
        if (recipient != null) {
            recipient.receiveMassage(message, sender.getUserId());
        } else {
            System.out.println("Система: Користувача з ID " + userTo + " не знайдено.");
        }
    }

    @Override
    public void sendMessageAll(String message, User sender) {
        for (User user : users.values()) {
            if (!user.getUserId().equals(sender.getUserId())) {
                user.receiveMassage(message, sender.getUserId());
            }
        }
    }
}