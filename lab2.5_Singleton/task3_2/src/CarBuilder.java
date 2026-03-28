public class CarBuilder {
    private Car.Type type;
    private Engine engine;
    private Transmission transmission;
    private Wheel wheel;
    private Car.Color color;

    public CarBuilder setType(Car.Type type) {
        this.type = type;
        return this;
    }

    public CarBuilder setEngine(Engine engine) {
        this.engine = engine;
        return this;
    }

    public CarBuilder setTransmission(Transmission transmission) {
        this.transmission = transmission;
        return this;
    }

    public CarBuilder setWheel(Wheel wheel) {
        this.wheel = wheel;
        return this;
    }

    public CarBuilder setColor(Car.Color color) {
        this.color = color;
        return this;
    }

    public Car build() {
        return new Car(type, engine, transmission, wheel, color);
    }
}
