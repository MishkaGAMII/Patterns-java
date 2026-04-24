public class SystemElement extends Component {

    public SystemElement(String name) {
        super(name);
    }

    @Override
    public void send(String message) {
        System.out.println(" [" + this.name + "] надсилає повідомлення: " + message);
        if (mediator != null) {
            mediator.sendMessage(message, this);
        } else {
            System.out.println("Помилка: Медіатор не заданий для " + this.name);
        }
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println(" [" + this.name + "] отримав повідомлення: " + message);
    }
}