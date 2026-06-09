public class Cake implements CakeComponent {
    private String flavor;
    private int layers;
    private String cream;

    public Cake(String flavor, int layers, String cream) {
        this.flavor = flavor;
        this.layers = layers;
        this.cream = cream;
    }

    @Override
    public double getPrice() {
        return 200.0 + (layers * 80.0); // Базова ціна + ціна за кожен корж
    }

    @Override
    public String getDescription() {
        return "Торт: " + flavor + ", шарів: " + layers + ", крем: " + cream;
    }
}