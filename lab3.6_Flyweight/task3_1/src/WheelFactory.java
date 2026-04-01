import java.util.HashMap;
import java.util.Map;

public class WheelFactory {
    private static final Map<String, Wheel> cache = new HashMap<>();

    private WheelFactory() {
    }

    public static Wheel getWheel(Wheel.Material material, int diameter) {
        String key = material + ":" + diameter;
        if (!cache.containsKey(key)) {
            cache.put(key, new Wheel(material, diameter));
        }
        return cache.get(key);
    }

    public static Wheel getWheel(int diameter) {
        return getWheel(Wheel.Material.Steel, diameter);
    }

    public static Wheel getWheel(Wheel wheel) {
        return getWheel(wheel.getMaterial(), wheel.getDiameter());
    }

    public static int getCreatedObjectsCount() {
        return cache.size();
    }
}
