import java.util.ArrayList;
import java.util.List;

public class CarBuilder {

    public Car buildCar() {
        Engine engine = new Engine("V8");

        List<Wheel> wheels = new ArrayList<>();
        wheels.add(new Wheel(16));
        wheels.add(new Wheel(16));
        wheels.add(new Wheel(16));
        wheels.add(new Wheel(16));

        return new Car(engine, wheels);
    }
}