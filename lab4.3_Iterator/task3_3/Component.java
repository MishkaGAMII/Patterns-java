public interface Component {
    void execute();
    String getName();
    int getValue(); // Повертає 0 для коробок або ціну для товарів
}
