public class Engine {
    public enum Fuel {
        Petrol,
        Diesel,
        Electric
    }

    private final int power;
    private final int torque;
    private final Fuel fuel;
    private final float volume;

    public Engine(int power, int torque, Fuel fuel, float volume) {
        this.power = power;
        this.torque = torque;
        this.fuel = fuel;
        this.volume = volume;
    }

    public int getPower() {
        return power;
    }

    public int getTorque() {
        return torque;
    }

    public Fuel getFuel() {
        return fuel;
    }

    public float getVolume() {
        return volume;
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
