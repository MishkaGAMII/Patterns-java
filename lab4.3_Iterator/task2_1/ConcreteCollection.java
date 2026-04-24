import java.util.ArrayList;
import java.util.List;

public class ConcreteCollection implements IterableCollection {
    private List<Element> elements = new ArrayList<>();

    public void addElement(Element element) {
        elements.add(element);
    }

    public List<Element> getElements() {
        return elements;
    }

    @Override
    public Iterator createIterator() {
        return new ConcreteIterator(this);
    }
}