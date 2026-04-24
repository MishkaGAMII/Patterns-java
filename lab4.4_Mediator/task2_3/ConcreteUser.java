public class ConcreteUser implements User {
    private final String userId;
    private final ChatMediator mediator;

    public ConcreteUser(String userId, ChatMediator mediator) {
        this.userId = userId;
        this.mediator = mediator;
    }

    @Override
    public String getUserId() {
        return userId;
    }

    @Override
    public void sendMessageAll(String message) {
        System.out.println("User " + userId + " sends to ALL: " + message);
        mediator.sendMessageAll(message, this);
    }

    @Override
    public void sendMessage(String message, String userTo) {
        System.out.println("User " + userId + " sends to " + userTo + ": " + message);
        mediator.sendMessage(message, userTo, this);
    }

    @Override
    public void receiveMassage(String message, String userFrom) {
        System.out.println("User " + userId + " receives message: [" + message + "] from user " + userFrom);
    }
}