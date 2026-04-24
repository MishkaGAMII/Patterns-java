public interface ChatMediator {
    void sendMessage(String message, String userTo, User sender);
    void sendMessageAll(String message, User sender);
    void addUser(User user);
}