public class Client {

    public static void main(String[] args) {
        
        ConcretePublisher publisher = new ConcretePublisher();
        
        Subscriber subscriberA = new ConcreteSubscriberA();
        Subscriber subscriberB = new ConcreteSubscriberB();
        
        publisher.subscribe(subscriberA);
        publisher.subscribe(subscriberB);
        
        publisher.mainBusinessLogic();
        
        System.out.println("--- Відписка SubscriberA ---");
        publisher.unsubscribe(subscriberA);
        
        publisher.mainBusinessLogic();
    }
}