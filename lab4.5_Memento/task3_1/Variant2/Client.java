import java.util.*;

public class Client {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(3, 3, 3);
        List<Memento> history = new ArrayList<>();
        float maxSquare = -1;
        Memento bestMemento = null;

        String[] edges = {"b", "c", "a", "c", "b"};
        float[] values = {4, 5, 4, 2, 3};

        for (int i = 0; i < edges.length; i++) {
            if (edges[i].equals("a")) triangle.setA(values[i]);
            else if (edges[i].equals("b")) triangle.setB(values[i]);
            else triangle.setC(values[i]);

            Memento m = triangle.save();
            history.add(m);
            if (triangle.square() > maxSquare) {
                maxSquare = triangle.square();
                bestMemento = m;
            }
        }
        triangle.restore(bestMemento);
        System.out.println("Restored Square: " + triangle.square());
    }
}