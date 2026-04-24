public abstract class Component {
    protected Mediator mediator;
    protected String name;

    public Component(String name) {
        this.name = name;
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public String getName() {
        return name;
    }

    public abstract void send(String message);
    public abstract void receiveMessage(String message);
}