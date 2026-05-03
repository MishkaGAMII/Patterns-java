import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileReader {
    private final String filePath;
    private final List<TextObserver> observers = new ArrayList<>();

    public FileReader(String filePath) {
        this.filePath = filePath;
    }

    public void addObserver(TextObserver observer) {
        observers.add(observer);
    }

    public void read() {
        try (BufferedReader reader = new BufferedReader(new java.io.FileReader(filePath))) {
            reader.lines().forEach(line -> {
                for (TextObserver observer : observers) {
                    observer.onLineRead(line);
                }
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}