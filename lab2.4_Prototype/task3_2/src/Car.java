public class Car implements Prototype<Car> {
    public enum CarColor {  // Колір автомобіля
        White,  // Білий
        Black,  // Чорний
        Red,    // Червоний
        Grey    // Сірий
    }

    public enum Type {  // Тип кузову автомобіля
        Sedan,      // Седан
        Hatchback,  // Хетчбек
        SUV         // Кросовер
    }

    final private Type type;          // Тип кузову
    final private CarColor carColor;  // Колір
    final private Engine engine;      // Двигун
    final private Wheel wheel;        // Колеса

    public Car(Type type, CarColor carColor, Engine engine, Wheel wheel) {
        this.type = type;
        this.carColor = carColor;
        this.engine = engine;
        this.wheel = wheel;
    }

    public Car(Car other) {
        this(other.type, other.carColor, other.engine.clone(), other.wheel.clone());
    }

    @Override
    public Car clone() {
        return new Car(this);
    }

    @Override
    public String toString() {
        return "Car:\n" +
                "type=" + type +
                ",\ncarColor=" + carColor +
                ",\nengine=" + engine +
                ",\nwheel=" + wheel +
                '\n';
    }
}
