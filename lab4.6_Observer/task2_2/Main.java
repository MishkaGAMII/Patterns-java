public class Main {
    public static void main(String[] args) {
        WeatherDataCenter dataCenter = new WeatherDataCenter();

        // Реєстрація сервісів
        dataCenter.subscribe(new TemperatureAlertService());
        dataCenter.subscribe(new HumidityAlertService());
        dataCenter.subscribe(new PressureAlertService());

        while (true) {
            if (dataCenter.update())
                break;
            
            try {
                Thread.sleep(100); // невелика затримка для виводу
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Finish of the simulation.");
    }
}