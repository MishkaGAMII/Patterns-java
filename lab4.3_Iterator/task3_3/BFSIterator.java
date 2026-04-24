import java.util.*;

class BFSIterator implements Iterator<Component> {
    private final Queue<Component> queue = new LinkedList<>();

    public BFSIterator(Component root) {
        queue.add(root);
    }

    @Override
    public boolean hasNext() {
        return !queue.isEmpty();
    }

    @Override
    public Component next() {
        if (!hasNext()) throw new NoSuchElementException();
        Component component = queue.poll();
        if (component instanceof Box) {
            queue.addAll(((Box) component).getChildren());
        }
        return component;
    }
}