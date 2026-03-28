public class Car {
    public enum CarColor {
        White,
        Black,
        Red,
        Grey,
        Blue,
        Silver,
        Green
    }

    public enum BodyType {
        Sedan,
        Hatchback,
        SUV,
        Coupe,
        Wagon,
        Pickup
    }

    public enum CarClass {
        Economy,
        Family,
        Business,
        Sport,
        OffRoad,
        Premium
    }

    private final BodyType bodyType;
    private final CarClass carClass;
    private final CarColor carColor;
    private final Engine engine;
    private final Transmission transmission;
    private final Wheel wheel;
    private final Tire tire;

    public Car(BodyType bodyType, CarClass carClass, CarColor carColor,
               Engine engine, Transmission transmission, Wheel wheel, Tire tire) {
        this.bodyType = bodyType;
        this.carClass = carClass;
        this.carColor = carColor;
        this.engine = engine;
        this.transmission = transmission;
        this.wheel = wheel;
        this.tire = tire;
    }

    public BodyType getBodyType() {
        return bodyType;
    }

    public CarClass getCarClass() {
        return carClass;
    }

    public CarColor getCarColor() {
        return carColor;
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

    public Tire getTire() {
        return tire;
    }

    @Override
    public String toString() {
        return "Car:\n" +
                "bodyType=" + bodyType +
                ",\ncarClass=" + carClass +
                ",\ncarColor=" + carColor +
                ",\nengine=" + engine +
                ",\ntransmission=" + transmission +
                ",\nwheel=" + wheel +
                ",\ntire=" + tire +
                '\n';
    }
}
