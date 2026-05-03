public class ConcreteSubscriberA implements Subscriber {
    
    @Override
    public void update(String context) {
        System.out.println("ConcreteSubscriberA: отримано оновлення -> " + context);
    }
}