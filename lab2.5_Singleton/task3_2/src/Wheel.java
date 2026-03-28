public class Wheel {
    public enum Material {
        Steel,
        Alloy,
        Forged
    }

    private final Material material;
    private final int diameter;
    private final String tireType;

    public Wheel(Material material, int diameter, String tireType) {
        this.material = material;
        this.diameter = diameter;
        this.tireType = tireType;
    }

    public Material getMaterial() {
        return material;
    }

    public int getDiameter() {
        return diameter;
    }

    public String getTireType() {
        return tireType;
    }

    @Override
    public String toString() {
        return "Wheel{" +
                "material=" + material +
                ", diameter=" + diameter +
                ", tireType='" + tireType + '\'' +
                '}';
    }
}
