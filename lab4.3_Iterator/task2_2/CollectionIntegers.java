import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class CollectionIntegers implements Iterable<Integer> {

    private final List<Integer> array = new ArrayList<>();

    public void add(int i) {
        array.add(i);
    }

    @Override
    public String toString() {
        return "Iterable{" +
                "array=" + array +
                '}';
    }

    public int size() {
        return array.size();
    }

    public Integer get(int i) {
        return array.get(i);
    }

    public List<Integer> getArray() {
        return array;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new AscendingIterator();
    }


    private class AscendingIterator implements Iterator<Integer> {
        private final List<Integer> sortedList;
        private int currentPosition = 0;

        public AscendingIterator() {
            this.sortedList = new ArrayList<>(array);
            Collections.sort(this.sortedList);
        }

        @Override
        public boolean hasNext() {
            return currentPosition < sortedList.size();
        }

        @Override
        public Integer next() {
            return sortedList.get(currentPosition++);
        }
    }
}