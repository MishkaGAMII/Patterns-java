public class Transmission {
    public enum Type {
        Manual,
        Automatic
    }

    private final Type type;
    private final int gearsCount;

    public Transmission(Type type, int gearsCount) {
        this.type = type;
        this.gearsCount = gearsCount;
    }

    public Type getType() {
        return type;
    }

    public int getGearsCount() {
        return gearsCount;
    }

    @Override
    public String toString() {
        return "Transmission{" +
                "type=" + type +
                ", gearsCount=" + gearsCount +
                '}';
    }
}
