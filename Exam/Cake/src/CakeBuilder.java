public class CakeBuilder {
    private String flavor = "Ванільний"; // Значення за замовчуванням
    private int layers = 1;
    private String cream = "Масляний";

    public CakeBuilder setFlavor(String flavor) {
        this.flavor = flavor;
        return this;
    }

    public CakeBuilder setLayers(int layers) {
        this.layers = layers;
        return this;
    }

    public CakeBuilder setCream(String cream) {
        this.cream = cream;
        return this;
    }

    public Cake build() {
        return new Cake(flavor, layers, cream);
    }
}