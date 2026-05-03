import java.util.ArrayList;
import java.util.List;

public class WeatherDataCenter {
    private final WeatherReader weatherReader;
    private final List<WeatherObserver> observers = new ArrayList<>();

    public WeatherDataCenter() {
        weatherReader = new WeatherReader("resources/input01.txt");
    }

    public void subscribe(WeatherObserver observer) {
        observers.add(observer);
    }

    private void notifyObservers(WeatherEvent event) {
        for (WeatherObserver observer : observers) {
            observer.update(event);
        }
    }

    public boolean update() {
        WeatherEvent weatherEvent = weatherReader.getEvent();
        if (weatherEvent == null) return false;
        if (weatherEvent.getLocation().equals("end")) return true;

        System.out.println("\n--- Data Received for " + weatherEvent.getLocation() + " ---");
        notifyObservers(weatherEvent);

        return false;
    }
}