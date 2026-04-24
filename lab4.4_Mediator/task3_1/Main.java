public class Main {
    public static void main(String[] args) {
        // Створюємо спільну інфраструктуру
        Runway runway = new Runway();
        PlanesInFlight planesInFlight = new PlanesInFlight();
        PlanesOnGround planesOnGround = new PlanesOnGround();

        // Створюємо посередника
        Mediator controlTower = new ControlTower(runway, planesInFlight, planesOnGround);

        // Створюємо літаки
        Plane plane1 = new Plane(123);
        Plane plane2 = new Plane(456);

        // Реєструємо літаки у вежі (вони автоматично потрапляють на землю)
        controlTower.registerPlane(plane1);
        controlTower.registerPlane(plane2);

        // Перший літак злітає (смуга стає зайнятою)
        plane1.takeOff();

        // Другий літак намагається злетіти, але смуга вже зайнята першим
        plane2.takeOff();
    }
}