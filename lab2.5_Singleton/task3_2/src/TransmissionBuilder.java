public class TransmissionBuilder {
    private Transmission.Type type;
    private int gearsCount;

    public TransmissionBuilder setType(Transmission.Type type) {
        this.type = type;
        return this;
    }

    public TransmissionBuilder setGearsCount(int gearsCount) {
        this.gearsCount = gearsCount;
        return this;
    }

    public Transmission build() {
        return new Transmission(type, gearsCount);
    }
}
