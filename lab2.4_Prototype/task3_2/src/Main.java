public class Main {
    public static void main(String[] args) {
        Engine engine = new Engine(105, 140, Engine.Fuel.Petrol, 1.4f);
        Wheel wheel = new Wheel(Wheel.Material.Steel, 14);
        Car car = new Car(Car.Type.Sedan, Car.CarColor.White, engine, wheel);

        Engine engineCopy = engine.clone();
        Wheel wheelCopy = wheel.clone();
        Car carCopy = car.clone();

        System.out.println("Original car:");
        System.out.println(car);

        System.out.println("Cloned car:");
        System.out.println(carCopy);

        System.out.println("Cloned engine:");
        System.out.println(engineCopy);

        System.out.println("Cloned wheel:");
        System.out.println(wheelCopy);
    }
}
