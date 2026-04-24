public class ConcreteUser implements User {

    private final String userId;
    private final String group;
    private final ChatMediator mediator;

    public ConcreteUser(String userId, String group, ChatMediator mediator) {
        this.userId = userId;
        this.group = group;
        this.mediator = mediator;
    }

    public String getUserId() {
        return userId;
    }

    public String getGroup() {
        return group;
    }

    @Override
    public void sendMessageAll(String message) {
        System.out.println("-> " + userId + " sends to ALL: " + message);
        mediator.sendMessageAll(message, this.userId);
    }

    @Override
    public void sendMessage(String message, String userTo) {
        System.out.println("-> " + userId + " sends to " + userTo + ": " + message);
        mediator.sendMessage(message, this.userId, userTo);
    }

    @Override
    public void sendMessageToGroup(String message, String groupTo) {
        System.out.println("-> " + userId + " sends to group [" + groupTo + "]: " + message);
        mediator.sendMessageToGroup(message, this.userId, groupTo);
    }

    @Override
    public void receiveMessage(String message, String userFrom) {
        System.out.println("<- User " + userId + " (Group: " + group + ") receives message: '" + message + "' from user " + userFrom);
    }
}