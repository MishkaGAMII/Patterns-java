import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(3, 3, 3);
        
        // Історія станів
        List<Triangle.Memento> history = new ArrayList<>();
        
        // Додаємо початковий стан
        history.add(triangle.save());

        // Список команд для виконання
        List<Command> commands = new ArrayList<>();
        commands.add(new SetSideCommand(triangle, "a", 5));
        commands.add(new ScaleCommand(triangle, "dupB"));
        commands.add(new ScaleCommand(triangle, "halfA"));
        commands.add(new SetSideCommand(triangle, "c", 4));
        commands.add(new ScaleCommand(triangle, "halfC"));

        System.out.println("Виконання команд...");
        for (Command cmd : commands) {
            cmd.execute();
            // Після кожної команди зберігаємо знімок
            history.add(triangle.save());
            System.out.println(triangle);
        }

        // Пошук стану з найменшою площею
        Triangle.Memento minAreaMemento = null;
        float minArea = Float.MAX_VALUE;

        for (Triangle.Memento m : history) {
            triangle.restore(m);
            float currentSquare = triangle.square();
            if (currentSquare < minArea) {
                minArea = currentSquare;
                minAreaMemento = m;
            }
        }

        // Відновлення
        System.out.println("\nВідновлення стану з найменшою площею");
        triangle.restore(minAreaMemento);
        System.out.println("Результат: " + triangle);
    }
}