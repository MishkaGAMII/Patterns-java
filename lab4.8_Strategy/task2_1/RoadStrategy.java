public class RoadStrategy implements RouteStrategy {
    @Override
    public String buildRoute(String A, String B) {
        return "Автомобільний маршрут з пункту " + A + " до пункту " + B;
    }
}