import java.util.ArrayList;
import java.util.List;

public class Box implements Component {
    private final int id;
    private final List<Component> children = new ArrayList<>();

    public Box(int id) { this.id = id; }

    public void add(Component component) { children.add(component); }

    public List<Component> getChildren() { return children; }

    @Override
    public void execute() {
        System.out.println("Box id: " + id);
        for (Component child : children) child.execute();
    }

    @Override
    public String getName() { return "Box_" + id; }

    @Override
    public int getValue() { return 0; }
}