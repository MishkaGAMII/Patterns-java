public interface Mediator {
    void registerComponent(Component component);
    void sendMessage(String message, Component sender);
}