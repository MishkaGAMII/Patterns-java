public class WheelBuilder {
    private Wheel.Material material;
    private int diameter;
    private String tireType;

    public WheelBuilder setMaterial(Wheel.Material material) {
        this.material = material;
        return this;
    }

    public WheelBuilder setDiameter(int diameter) {
        this.diameter = diameter;
        return this;
    }

    public WheelBuilder setTireType(String tireType) {
        this.tireType = tireType;
        return this;
    }

    public Wheel build() {
        return new Wheel(material, diameter, tireType);
    }
}
