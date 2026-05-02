import java.util.*;

public class Client {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(3, 3, 3);
        List<Triangle.Memento> history = new ArrayList<>();
        List<Float> squares = new ArrayList<>();

        String[] edges = {"b", "c", "a", "c", "b"};
        float[] values = {4, 5, 4, 2, 3};

        for (int i = 0; i < edges.length; i++) {
            switch (edges[i]) {
                case "a" -> triangle.setA(values[i]);
                case "b" -> triangle.setB(values[i]);
                case "c" -> triangle.setC(values[i]);
            }
            history.add(triangle.save());
            squares.add(triangle.square());
        }

        int maxIdx = 0;
        for (int i = 1; i < squares.size(); i++) {
            if (squares.get(i) > squares.get(maxIdx)) maxIdx = i;
        }

        triangle.restore(history.get(maxIdx));
        System.out.println("Max square restored: " + triangle.square());
    }
}