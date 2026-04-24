public interface User {
    void sendMessageAll(String message);
    void sendMessage(String message, String userTo);
    void sendMessageToGroup(String message, String groupTo); // Новий метод
    void receiveMessage(String message, String userFrom);
}