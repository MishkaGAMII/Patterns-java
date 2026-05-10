public class WalkingStrategy implements RouteStrategy {
    @Override
    public String buildRoute(String A, String B) {
        return "Пішохідний маршрут з пункту " + A + " до пункту " + B;
    }
}