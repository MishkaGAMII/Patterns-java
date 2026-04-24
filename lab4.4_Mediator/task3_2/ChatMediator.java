public interface ChatMediator {
    void addUser(ConcreteUser user);
    void sendMessageAll(String message, String userFromId);
    void sendMessage(String message, String userFromId, String userToId);
    void sendMessageToGroup(String message, String userFromId, String groupTo);
}