public class Main {

  public static void main(String[] args) {

    ShopItem pens = new ShopItem("pen", 175);
    ShopItem pencils = new ShopItem("pencil", 15); // змінено для наочності
    ShopItem paper = new ShopItem("paper", 500);

    Shop shop = new Shop();
    shop.putItem(pens);
    shop.putItem(pencils);
    shop.putItem(paper);

    System.out.println("--- Сортування за алфавітом (default): ---");
    for (ShopItem item : shop) {
      System.out.println(item);
    }

    System.out.println("\n--- Сортування за спаданням кількості: ---");
    for (ShopItem item : shop.sortByQuantity()) {
      System.out.println(item);
    }
  }
}