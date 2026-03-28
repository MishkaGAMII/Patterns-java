public class Director {
    public Car buildEconomySedan() {
        Engine engine = new EngineBuilder()
                .setPower(105)
                .setTorque(145)
                .setFuel(Engine.Fuel.Petrol)
                .setVolume(1.4f)
                .build();

        Transmission transmission = new TransmissionBuilder()
                .setType(Transmission.TransmissionType.Manual)
                .setGears(5)
                .build();

        Wheel wheel = new WheelBuilder()
                .setMaterial(Wheel.Material.Steel)
                .setDiameter(15)
                .build();

        Tire tire = new TireBuilder()
                .setType(Tire.TireType.AllSeason)
                .setWidth(185)
                .setProfile(65)
                .setRadius(15)
                .build();

        return new CarBuilder()
                .setBodyType(Car.BodyType.Sedan)
                .setCarClass(Car.CarClass.Economy)
                .setCarColor(Car.CarColor.White)
                .setEngine(engine)
                .setTransmission(transmission)
                .setWheel(wheel)
                .setTire(tire)
                .build();
    }

    public Car buildFamilySUV() {
        Engine engine = new EngineBuilder()
                .setPower(190)
                .setTorque(320)
                .setFuel(Engine.Fuel.Diesel)
                .setVolume(2.0f)
                .build();

        Transmission transmission = new TransmissionBuilder()
                .setType(Transmission.TransmissionType.Automatic)
                .setGears(8)
                .build();

        Wheel wheel = new WheelBuilder()
                .setMaterial(Wheel.Material.Alloy)
                .setDiameter(18)
                .build();

        Tire tire = new TireBuilder()
                .setType(Tire.TireType.AllSeason)
                .setWidth(235)
                .setProfile(55)
                .setRadius(18)
                .build();

        return new CarBuilder()
                .setBodyType(Car.BodyType.SUV)
                .setCarClass(Car.CarClass.Family)
                .setCarColor(Car.CarColor.Grey)
                .setEngine(engine)
                .setTransmission(transmission)
                .setWheel(wheel)
                .setTire(tire)
                .build();
    }

    public Car buildSportCoupe() {
        Engine engine = new EngineBuilder()
                .setPower(320)
                .setTorque(420)
                .setFuel(Engine.Fuel.Petrol)
                .setVolume(3.0f)
                .build();

        Transmission transmission = new TransmissionBuilder()
                .setType(Transmission.TransmissionType.Robotized)
                .setGears(7)
                .build();

        Wheel wheel = new WheelBuilder()
                .setMaterial(Wheel.Material.Forged)
                .setDiameter(19)
                .build();

        Tire tire = new TireBuilder()
                .setType(Tire.TireType.Summer)
                .setWidth(255)
                .setProfile(40)
                .setRadius(19)
                .build();

        return new CarBuilder()
                .setBodyType(Car.BodyType.Coupe)
                .setCarClass(Car.CarClass.Sport)
                .setCarColor(Car.CarColor.Red)
                .setEngine(engine)
                .setTransmission(transmission)
                .setWheel(wheel)
                .setTire(tire)
                .build();
    }

    public Car buildElectricCityHatchback() {
        Engine engine = new EngineBuilder()
                .setPower(150)
                .setTorque(310)
                .setFuel(Engine.Fuel.Electric)
                .setVolume(0.0f)
                .build();

        Transmission transmission = new TransmissionBuilder()
                .setType(Transmission.TransmissionType.Automatic)
                .setGears(1)
                .build();

        Wheel wheel = new WheelBuilder()
                .setMaterial(Wheel.Material.Alloy)
                .setDiameter(17)
                .build();

        Tire tire = new TireBuilder()
                .setType(Tire.TireType.AllSeason)
                .setWidth(205)
                .setProfile(50)
                .setRadius(17)
                .build();

        return new CarBuilder()
                .setBodyType(Car.BodyType.Hatchback)
                .setCarClass(Car.CarClass.Premium)
                .setCarColor(Car.CarColor.Blue)
                .setEngine(engine)
                .setTransmission(transmission)
                .setWheel(wheel)
                .setTire(tire)
                .build();
    }

    public Car buildOffRoadPickup() {
        Engine engine = new EngineBuilder()
                .setPower(250)
                .setTorque(500)
                .setFuel(Engine.Fuel.Diesel)
                .setVolume(3.2f)
                .build();

        Transmission transmission = new TransmissionBuilder()
                .setType(Transmission.TransmissionType.Automatic)
                .setGears(6)
                .build();

        Wheel wheel = new WheelBuilder()
                .setMaterial(Wheel.Material.Alloy)
                .setDiameter(18)
                .build();

        Tire tire = new TireBuilder()
                .setType(Tire.TireType.OffRoad)
                .setWidth(265)
                .setProfile(60)
                .setRadius(18)
                .build();

        return new CarBuilder()
                .setBodyType(Car.BodyType.Pickup)
                .setCarClass(Car.CarClass.OffRoad)
                .setCarColor(Car.CarColor.Black)
                .setEngine(engine)
                .setTransmission(transmission)
                .setWheel(wheel)
                .setTire(tire)
                .build();
    }
}
