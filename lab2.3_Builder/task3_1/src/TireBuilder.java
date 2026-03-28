public class TireBuilder {
    private Tire.TireType type;
    private int width;
    private int profile;
    private int radius;

    public TireBuilder setType(Tire.TireType type) {
        this.type = type;
        return this;
    }

    public TireBuilder setWidth(int width) {
        this.width = width;
        return this;
    }

    public TireBuilder setProfile(int profile) {
        this.profile = profile;
        return this;
    }

    public TireBuilder setRadius(int radius) {
        this.radius = radius;
        return this;
    }

    public Tire build() {
        if (type == null) {
            throw new IllegalStateException("Tire type must be specified.");
        }
        if (width < 145 || width > 355) {
            throw new IllegalStateException("Tire width must be in range 145..355.");
        }
        if (profile < 25 || profile > 85) {
            throw new IllegalStateException("Tire profile must be in range 25..85.");
        }
        if (radius < 13 || radius > 24) {
            throw new IllegalStateException("Tire radius must be in range 13..24.");
        }
        return new Tire(type, width, profile, radius);
    }
}
