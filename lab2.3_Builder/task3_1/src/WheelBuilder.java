public class WheelBuilder {
    private Wheel.Material material;
    private int diameter;

    public WheelBuilder setMaterial(Wheel.Material material) {
        this.material = material;
        return this;
    }

    public WheelBuilder setDiameter(int diameter) {
        this.diameter = diameter;
        return this;
    }

    public Wheel build() {
        if (material == null) {
            throw new IllegalStateException("Wheel material must be specified.");
        }
        if (diameter < 13 || diameter > 24) {
            throw new IllegalStateException("Wheel diameter must be in range 13..24.");
        }
        return new Wheel(material, diameter);
    }
}
