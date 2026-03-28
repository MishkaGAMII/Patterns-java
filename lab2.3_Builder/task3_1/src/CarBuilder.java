public class CarBuilder {
    private Car.BodyType bodyType;
    private Car.CarClass carClass;
    private Car.CarColor carColor;
    private Engine engine;
    private Transmission transmission;
    private Wheel wheel;
    private Tire tire;

    public CarBuilder setBodyType(Car.BodyType bodyType) {
        this.bodyType = bodyType;
        return this;
    }

    public CarBuilder setCarClass(Car.CarClass carClass) {
        this.carClass = carClass;
        return this;
    }

    public CarBuilder setCarColor(Car.CarColor carColor) {
        this.carColor = carColor;
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

    public CarBuilder setTire(Tire tire) {
        this.tire = tire;
        return this;
    }

    public Car build() {
        if (bodyType == null) {
            throw new IllegalStateException("Body type must be specified.");
        }
        if (carClass == null) {
            throw new IllegalStateException("Car class must be specified.");
        }
        if (carColor == null) {
            throw new IllegalStateException("Car color must be specified.");
        }
        if (engine == null) {
            throw new IllegalStateException("Engine must be specified.");
        }
        if (transmission == null) {
            throw new IllegalStateException("Transmission must be specified.");
        }
        if (wheel == null) {
            throw new IllegalStateException("Wheel must be specified.");
        }
        if (tire == null) {
            throw new IllegalStateException("Tire must be specified.");
        }
        if (wheel.getDiameter() != tire.getRadius()) {
            throw new IllegalStateException("Wheel diameter and tire radius must match.");
        }

        return new Car(bodyType, carClass, carColor, engine, transmission, wheel, tire);
    }
}
