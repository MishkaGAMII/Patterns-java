public class Main {
    public static void main(String[] args) {
        Director director = new Director();

        Car economySedan = director.buildEconomySedan();
        Car familySUV = director.buildFamilySUV();
        Car sportCoupe = director.buildSportCoupe();
        Car electricHatchback = director.buildElectricCityHatchback();
        Car offRoadPickup = director.buildOffRoadPickup();

        System.out.println("=== Economy sedan ===");
        System.out.println(economySedan);

        System.out.println("=== Family SUV ===");
        System.out.println(familySUV);

        System.out.println("=== Sport coupe ===");
        System.out.println(sportCoupe);

        System.out.println("=== Electric city hatchback ===");
        System.out.println(electricHatchback);

        System.out.println("=== Off-road pickup ===");
        System.out.println(offRoadPickup);

        Car customCar = new CarBuilder()
                .setBodyType(Car.BodyType.Wagon)
                .setCarClass(Car.CarClass.Business)
                .setCarColor(Car.CarColor.Silver)
                .setEngine(new EngineBuilder()
                        .setPower(200)
                        .setTorque(340)
                        .setFuel(Engine.Fuel.Hybrid)
                        .setVolume(2.5f)
                        .build())
                .setTransmission(new TransmissionBuilder()
                        .setType(Transmission.TransmissionType.CVT)
                        .setGears(6)
                        .build())
                .setWheel(new WheelBuilder()
                        .setMaterial(Wheel.Material.Alloy)
                        .setDiameter(17)
                        .build())
                .setTire(new TireBuilder()
                        .setType(Tire.TireType.AllSeason)
                        .setWidth(215)
                        .setProfile(55)
                        .setRadius(17)
                        .build())
                .build();

        System.out.println("=== Custom business wagon ===");
        System.out.println(customCar);
    }
}
