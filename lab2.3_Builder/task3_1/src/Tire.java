public class Tire {
    public enum TireType {
        Summer,
        Winter,
        AllSeason,
        OffRoad
    }

    private final TireType type;
    private final int width;
    private final int profile;
    private final int radius;

    public Tire(TireType type, int width, int profile, int radius) {
        this.type = type;
        this.width = width;
        this.profile = profile;
        this.radius = radius;
    }

    public TireType getType() {
        return type;
    }

    public int getWidth() {
        return width;
    }

    public int getProfile() {
        return profile;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public String toString() {
        return "Tire{" +
                "type=" + type +
                ", width=" + width +
                ", profile=" + profile +
                ", radius=" + radius +
                '}';
    }
}
