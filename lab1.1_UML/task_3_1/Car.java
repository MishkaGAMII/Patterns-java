import java.util.List;

public class Car {
    private Engine engine;
    private List<Wheel> wheels;

    public Car(Engine engine, List<Wheel> wheels) {
        this.engine = engine;
        this.wheels = wheels;
    }
}