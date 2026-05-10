public class BikeStrategy implements RouteStrategy {
    @Override
    public String buildRoute(String A, String B) {
        return "Велосипедний маршрут з пункту " + A + " до пункту " + B + ". Крути педалі!";
    }
}