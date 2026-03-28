public class Wheel implements Prototype<Wheel> {
    public enum Material {  // Матеріал диску
        Steel,   // Стальний диск
        Alloy,   // Легкосплавний
        Forged   // Кований легкосплавний диск
    }

    final private Material material;  // Матеріал диску
    final int diameter;               // Діаметр колеса

    public Wheel(Material material, int diameter) {
        this.material = material;
        this.diameter = diameter;
    }

    public Wheel(Wheel other) {
        this(other.material, other.diameter);
    }

    @Override
    public Wheel clone() {
        return new Wheel(this);
    }

    @Override
    public String toString() {
        return "Wheel{" +
                "material=" + material +
                ", diameter=" + diameter +
                '}';
    }
}
