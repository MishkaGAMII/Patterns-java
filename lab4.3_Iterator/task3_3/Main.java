import java.util.Random;

import javax.swing.Box;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        final Box root = new Box(-999);

        for (int j = 0; j < 10; j++) {
            final Box box = new Box(j);
            root.add(box);
            for (int i = 0; i < 10; i++) {
                String name = String.format("Item_%s", j * 10 + i);
                int value = random.nextInt(1000) + 1;
                box.add(new Item(name, value));
            }
        }

        System.out.println("--- Пошук за допомогою ітератора (DFS) ---");
        DFSIterator iterator = new DFSIterator(root);
        // BFSIterator iterator = new BFSIterator(root);

        Item cheapest = null;
        Item mostExpensive = null;

        while (iterator.hasNext()) {
            Component current = iterator.next();
            if (current instanceof Item item) {
                if (cheapest == null || item.getValue() < cheapest.getValue()) {
                    cheapest = item;
                }
                if (mostExpensive == null || item.getValue() > mostExpensive.getValue()) {
                    mostExpensive = item;
                }
            }
        }

        System.out.println("Найдешевший елемент: " + cheapest);
        System.out.println("Найдорожчий елемент: " + mostExpensive);
    }
}