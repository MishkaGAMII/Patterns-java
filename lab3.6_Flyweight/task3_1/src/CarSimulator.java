import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class CarSimulator {

    private static final ArrayList<Car> vehicles = new ArrayList<>();
    private static final CarBuilder carBuilder = new CarBuilder();
    private static final Random random = new Random();

    public static void main(String[] args) {
        Runnable createVehicles = new Runnable() {
            @Override
            public void run() {
                createRandomCar();
            }
        };

        ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
        executor.scheduleAtFixedRate(createVehicles, 0, 1, TimeUnit.SECONDS);
    }

    private static void createRandomCar() {
        Engine.Fuel fuel = Engine.Fuel.values()[random.nextInt(Engine.Fuel.values().length)];
        int wheelDiameter = 17 + random.nextInt(3);
        int power = (11 + random.nextInt(5)) * 10;
        Car.CarColor color = Car.CarColor.values()[random.nextInt(Car.CarColor.values().length)];
        Car.Type type = Car.Type.values()[random.nextInt(Car.Type.values().length)];

        Car car = carBuilder
                .reset()
                .setType(type)
                .setCarColor(color)
                .setEngine(new Engine(power, fuel))
                .setWheel(new Wheel(wheelDiameter))
                .build();

        System.out.println("Creating " + car);
        car.showInfo();

        vehicles.add(car);

        System.out.println("Cars in simulator: " + vehicles.size());
        System.out.println("Unique engines created: " + EngineFactory.getCreatedObjectsCount());
        System.out.println("Unique wheels created: " + WheelFactory.getCreatedObjectsCount());
        System.out.println("---------------------------------");
    }
}
