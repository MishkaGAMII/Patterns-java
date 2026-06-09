public abstract class CakeDecorator implements CakeComponent {
    protected CakeComponent cake;

    public CakeDecorator(CakeComponent cake) {
        this.cake = cake;
    }

    @Override
    public double getPrice() {
        return cake.getPrice();
    }

    @Override
    public String getDescription() {
        return cake.getDescription();
    }
}