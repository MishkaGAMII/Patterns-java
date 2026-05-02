import java.util.*;

public class Client {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(3, 3, 3);
        List<IMemento> history = new ArrayList<>();
        float maxS = -1;
        IMemento best = null;

        String[] edges = {"b", "c", "a", "c", "b"};
        float[] values = {4, 5, 4, 2, 3};

        for (int i = 0; i < edges.length; i++) {
            if (edges[i].equals("a")) triangle.setA(values[i]);
            else if (edges[i].equals("b")) triangle.setB(values[i]);
            else triangle.setC(values[i]);

            IMemento m = triangle.save();
            history.add(m);
            if (triangle.square() > maxS) {
                maxS = triangle.square();
                best = m;
            }
        }
        
        best.restore(); // Відновлення через сам знімок
        System.out.println("Max square (protected): " + triangle.square());
    }
}