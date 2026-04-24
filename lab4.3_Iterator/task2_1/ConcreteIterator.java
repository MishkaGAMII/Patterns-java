public class ConcreteIterator implements Iterator {
    private ConcreteCollection collection;
    private int currentPosition = 0;

    public ConcreteIterator(ConcreteCollection collection) {
        this.collection = collection;
    }

    @Override
    public boolean hasMore() {
        return currentPosition < collection.getElements().size();
    }

    @Override
    public Element getNext() {
        if (!hasMore()) {
            return null;
        }
        Element element = collection.getElements().get(currentPosition);
        currentPosition++;
        return element;
    }
}