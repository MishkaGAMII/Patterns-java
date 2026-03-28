public class CarSimulator {

    public static void main(String[] args) {
        CarBuilder builder = new CarBuilder();
        Car car = builder.buildCar();

        System.out.println("Car created!");
    }
}