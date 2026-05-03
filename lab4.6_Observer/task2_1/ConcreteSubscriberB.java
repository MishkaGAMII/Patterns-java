public class ConcreteSubscriberB implements Subscriber {
    
    @Override
    public void update(String context) {
        System.out.println("ConcreteSubscriberB: отримано оновлення -> " + context);
    }
}