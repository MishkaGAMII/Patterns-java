import java.util.*;

class DFSIterator implements Iterator<Component> {
    private final Stack<Iterator<Component>> stack = new Stack<>();

    public DFSIterator(Component root) {
        stack.push(Collections.singletonList(root).iterator());
    }

    @Override
    public boolean hasNext() {
        if (stack.isEmpty()) return false;
        Iterator<Component> it = stack.peek();
        if (!it.hasNext()) {
            stack.pop();
            return hasNext();
        }
        return true;
    }

    @Override
    public Component next() {
        if (!hasNext()) throw new NoSuchElementException();
        Iterator<Component> it = stack.peek();
        Component component = it.next();
        if (component instanceof Box) {
            stack.push(((Box) component).getChildren().iterator());
        }
        return component;
    }
}