public class SkodaFactory implements MunicipalTransportFactory {
    @Override
    public Bus createBus() {
        return new Bus(4_500_000, 25);
    }

    @Override
    public Tram createTram() {
        return new Tram(9_000_000, 8);
    }

    @Override
    public Trolleybus createTrolleybus() {
        return new Trolleybus(6_800_000, 12);
    }

    @Override
    public String getManufacturerName() {
        return "Skoda";
    }
}
