public class Client {
    public static void main(String[] args) {
        ConcreteCollection collection = new ConcreteCollection();
        collection.addElement(new Element("ID-001"));
        collection.addElement(new Element("ID-002"));
        collection.addElement(new Element("ID-003"));

        Iterator iterator = collection.createIterator();

        System.out.println("Перелік елементів колекції через Ітератор:");
        
        while (iterator.hasMore()) {
            Element element = iterator.getNext();
            System.out.println(element);
        }
    }
}
