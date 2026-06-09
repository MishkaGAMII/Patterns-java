public class MessageDecorator extends CakeDecorator {
    private String message;

    public MessageDecorator(CakeComponent cake, String message) {
        super(cake);
        this.message = message;
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 50.0; // Фіксована ціна за напис
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + Напис: \"" + message + "\"";
    }
}