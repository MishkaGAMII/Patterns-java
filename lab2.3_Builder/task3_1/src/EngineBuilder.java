public class EngineBuilder {
    private int power;
    private int torque;
    private Engine.Fuel fuel;
    private float volume;

    public EngineBuilder setPower(int power) {
        this.power = power;
        return this;
    }

    public EngineBuilder setTorque(int torque) {
        this.torque = torque;
        return this;
    }

    public EngineBuilder setFuel(Engine.Fuel fuel) {
        this.fuel = fuel;
        return this;
    }

    public EngineBuilder setVolume(float volume) {
        this.volume = volume;
        return this;
    }

    public Engine build() {
        if (fuel == null) {
            throw new IllegalStateException("Fuel type must be specified.");
        }
        if (power <= 0) {
            throw new IllegalStateException("Engine power must be positive.");
        }
        if (torque <= 0) {
            throw new IllegalStateException("Engine torque must be positive.");
        }
        if (fuel == Engine.Fuel.Electric) {
            if (volume != 0.0f) {
                throw new IllegalStateException("Electric engine must have 0.0 volume.");
            }
        } else if (volume <= 0.0f) {
            throw new IllegalStateException("Engine volume must be positive for non-electric engines.");
        }

        return new Engine(power, torque, fuel, volume);
    }
}
