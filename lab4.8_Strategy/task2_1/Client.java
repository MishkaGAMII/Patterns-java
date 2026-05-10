public class Client {
    public static void main(String[] args) {
        Navigator navigator = new Navigator();

        navigator.setStrategy(new RoadStrategy());
        navigator.buildRoute("Троєщина", "Теремки");

        navigator.setStrategy(new BikeStrategy());
        navigator.buildRoute("Троєщина", "Теремки");
        
        navigator.setStrategy(new WalkingStrategy());
        navigator.buildRoute("Хрещатик", "Поділ");
    }
}