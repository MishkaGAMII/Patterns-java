public class Director {
    private Director() {
    }

    private static class DirectorHolder {
        private static final Director INSTANCE = new Director();
    }

    public static Director getInstance() {
        return DirectorHolder.INSTANCE;
    }

    public Car buildCitySedan() {
        Engine engine = new EngineBuilder()
                .setPower(110)
                .setTorque(145)
                .setFuel(Engine.Fuel.Petrol)
                .setVolume(1.6f)
                .build();

        Transmission transmission = new TransmissionBuilder()
                .setType(Transmission.Type.Manual)
                .setGearsCount(5)
                .build();

        Wheel wheel = new WheelBuilder()
                .setMaterial(Wheel.Material.Steel)
                .setDiameter(15)
                .setTireType("Summer")
                .build();

        return new CarBuilder()
                .setType(Car.Type.Sedan)
                .setColor(Car.Color.White)
                .setEngine(engine)
                .setTransmission(transmission)
                .setWheel(wheel)
                .build();
    }

    public Car buildFamilySUV() {
        Engine engine = new EngineBuilder()
                .setPower(180)
                .setTorque(320)
                .setFuel(Engine.Fuel.Diesel)
                .setVolume(2.0f)
                .build();

        Transmission transmission = new TransmissionBuilder()
                .setType(Transmission.Type.Automatic)
                .setGearsCount(8)
                .build();

        Wheel wheel = new WheelBuilder()
                .setMaterial(Wheel.Material.Alloy)
                .setDiameter(18)
                .setTireType("All-season")
                .build();

        return new CarBuilder()
                .setType(Car.Type.SUV)
                .setColor(Car.Color.Black)
                .setEngine(engine)
                .setTransmission(transmission)
                .setWheel(wheel)
                .build();
    }

    public Car buildElectricHatchback() {
        Engine engine = new EngineBuilder()
                .setPower(150)
                .setTorque(260)
                .setFuel(Engine.Fuel.Electric)
                .setVolume(0.0f)
                .build();

        Transmission transmission = new TransmissionBuilder()
                .setType(Transmission.Type.Automatic)
                .setGearsCount(1)
                .build();

        Wheel wheel = new WheelBuilder()
                .setMaterial(Wheel.Material.Forged)
                .setDiameter(17)
                .setTireType("Summer")
                .build();

        return new CarBuilder()
                .setType(Car.Type.Hatchback)
                .setColor(Car.Color.Blue)
                .setEngine(engine)
                .setTransmission(transmission)
                .setWheel(wheel)
                .build();
    }
}
