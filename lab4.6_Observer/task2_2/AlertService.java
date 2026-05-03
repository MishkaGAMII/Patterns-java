// Сервіс контролю температури
class TemperatureAlertService implements WeatherObserver {
    @Override
    public void update(WeatherEvent event) {
        if (event.getTemperature() > 35 || event.getTemperature() < -30) {
            System.out.println("ALERT [Temperature]: In " + event.getLocation() + 
                               " value " + event.getTemperature() + " is out of range!");
        }
    }
}

// Сервіс контролю вологості
class HumidityAlertService implements WeatherObserver {
    @Override
    public void update(WeatherEvent event) {
        if (event.getHumidity() > 90 || event.getHumidity() < 10) {
            System.out.println("ALERT [Humidity]: In " + event.getLocation() + 
                               " value " + event.getHumidity() + "% is critical!");
        }
    }
}

// Сервіс контролю тиску
class PressureAlertService implements WeatherObserver {
    @Override
    public void update(WeatherEvent event) {
        if (event.getPressure() > 780 || event.getPressure() < 720) {
            System.out.println("ALERT [Pressure]: In " + event.getLocation() + 
                               " value " + event.getPressure() + " mmHg is abnormal!");
        }
    }
}