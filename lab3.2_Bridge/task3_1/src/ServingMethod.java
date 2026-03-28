public interface ServingMethod {
    void prepareContainer();
    void serve(String beverageName);
    void drink(String beverageName);
    int cost();
}
