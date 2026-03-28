public class Car {
    public enum Type {
        Sedan,
        Hatchback,
        SUV
    }

    public enum Color {
        White,
        Black,
        Red,
        Grey,
        Blue
    }

    private final Type type;
    private final Engine engine;
    private final Transmission transmission;
    private final Wheel wheel;
    private final Color color;

    public Car(Type type, Engine engine, Transmission transmission, Wheel wheel, Color color) {
        this.type = type;
        this.engine = engine;
        this.transmission = transmission;
        this.wheel = wheel;
        this.color = color;
    }

    public Type getType() {
        return type;
    }

    public Engine getEngine() {
        return engine;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public Wheel getWheel() {
        return wheel;
    }

    public Color getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Car:\n" +
                "type=" + type + ",\n" +
                "color=" + color + ",\n" +
                "engine=" + engine + ",\n" +
                "transmission=" + transmission + ",\n" +
                "wheel=" + wheel + '\n';
    }
}
