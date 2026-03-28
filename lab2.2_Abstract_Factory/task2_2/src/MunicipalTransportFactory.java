public interface MunicipalTransportFactory {
    Bus createBus();

    Tram createTram();

    Trolleybus createTrolleybus();

    String getManufacturerName();
}
