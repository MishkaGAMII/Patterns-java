import java.util.ArrayList;
import java.util.List;

public class MessageBroker implements Mediator {
    private List<Component> components;

    public MessageBroker() {
        this.components = new ArrayList<>();
    }

    @Override
    public void registerComponent(Component component) {
        this.components.add(component);
        component.setMediator(this);
    }

    @Override
    public void sendMessage(String message, Component sender) {
        for (Component component : components) {
            if (component != sender) {
                component.receiveMessage(message);
            }
        }
    }
}