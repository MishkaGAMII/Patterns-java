public class Wheel {
    public enum Material {
        Steel,
        Alloy,
        Forged
    }

    private final Material material;
    private final int diameter;

    public Wheel(Material material, int diameter) {
        this.material = material;
        this.diameter = diameter;
    }

    public Material getMaterial() {
        return material;
    }

    public int getDiameter() {
        return diameter;
    }

    @Override
    public String toString() {
        return "Wheel{" +
                "material=" + material +
                ", diameter=" + diameter +
                '}';
    }
}
