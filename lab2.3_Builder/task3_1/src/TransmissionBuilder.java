public class TransmissionBuilder {
    private Transmission.TransmissionType type;
    private int gears;

    public TransmissionBuilder setType(Transmission.TransmissionType type) {
        this.type = type;
        return this;
    }

    public TransmissionBuilder setGears(int gears) {
        this.gears = gears;
        return this;
    }

    public Transmission build() {
        if (type == null) {
            throw new IllegalStateException("Transmission type must be specified.");
        }
        if (gears <= 0) {
            throw new IllegalStateException("Transmission must have a positive number of gears.");
        }
        return new Transmission(type, gears);
    }
}
