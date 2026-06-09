import java.util.ArrayList;
import java.util.List;

public class GameEngine {
    private static GameEngine instance;
    private int score = 0;
    private List<GameObserver> observers = new ArrayList<>();

    private GameEngine() {}

    // Патерн Singleton
    public static synchronized GameEngine getInstance() {
        if (instance == null) {
            instance = new GameEngine();
        }
        return instance;
    }

    // Патерн Observer
    public void addObserver(GameObserver observer) { 
        observers.add(observer); 
    }
    
    public void addScore(int points) {
        score += points;
        notifyObservers();
    }

    private void notifyObservers() {
        for (GameObserver obs : observers) {
            obs.updateScore(score);
        }
    }
}