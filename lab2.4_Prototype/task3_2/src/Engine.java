public class Engine implements Prototype<Engine> {
    public enum Fuel {  // Тип пального
        Petrol,    // Бензин
        Diesel,    // Дизель
        Electric   // Електрика
    }

    final int power;     // Потужність
    final int torque;    // Крутний момент
    final Fuel fuel;     // Вид пального
    final float volume;  // Об'єм двигуна

    public Engine(int power, int torque, Fuel fuel, float volume) {
        this.power = power;
        this.torque = torque;
        this.fuel = fuel;
        this.volume = volume;
    }

    public Engine(Engine other) {
        this(other.power, other.torque, other.fuel, other.volume);
    }

    @Override
    public Engine clone() {
        return new Engine(this);
    }

    @Override
    public String toString() {
        return "Engine{" +
                "power=" + power +
                ", torque=" + torque +
                ", fuel=" + fuel +
                ", volume=" + volume +
                '}';
    }
}
