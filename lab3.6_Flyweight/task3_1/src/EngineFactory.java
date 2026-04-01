import java.util.HashMap;
import java.util.Map;

public class EngineFactory {
    private static final Map<String, Engine> cache = new HashMap<>();

    private EngineFactory() {
    }

    public static Engine getEngine(int power, Engine.Fuel fuel) {
        String key = power + ":" + fuel;
        if (!cache.containsKey(key)) {
            cache.put(key, new Engine(power, fuel));
        }
        return cache.get(key);
    }

    public static Engine getEngine(Engine engine) {
        return getEngine(engine.getPower(), engine.getFuel());
    }

    public static int getCreatedObjectsCount() {
        return cache.size();
    }
}
