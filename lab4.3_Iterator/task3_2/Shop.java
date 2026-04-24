import java.util.*;

public class Shop implements Iterable<ShopItem> {

    private final HashMap<String, ShopItem> items = new HashMap<>();

    public void putItem(ShopItem item){
        items.put(item.getName(), item);
    }

    // Стандартний ітератор (використовується в for (ShopItem item : shop))
    @Override
    public Iterator<ShopItem> iterator() {
        return getAlphabeticalIterator();
    }

    // 1. Ітератор за алфавітом
    public Iterator<ShopItem> getAlphabeticalIterator() {
        List<ShopItem> sortedList = new ArrayList<>(items.values());
        sortedList.sort(Comparator.comparing(ShopItem::getName));
        return sortedList.iterator();
    }

    // 2. Ітератор за спаданням кількості
    public Iterator<ShopItem> getQuantityIterator() {
        List<ShopItem> sortedList = new ArrayList<>(items.values());
        // Сортування за кількістю (reversed для спадання)
        sortedList.sort(Comparator.comparingInt(ShopItem::getQuantity).reversed());
        return sortedList.iterator();
    }

    // Допоміжний метод для зручного використання в for-each для кількості
    public Iterable<ShopItem> sortByQuantity() {
        return this::getQuantityIterator;
    }
}