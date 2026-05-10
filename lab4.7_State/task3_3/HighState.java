public class HighState implements State {

    @Override
    public void turnUp(Fan fan) {
        // Залишається на високій швидкості
    }

    @Override
    public void turnDown(Fan fan) {
        fan.setState(new MediumState());
        System.out.println("Fan is on medium");
    }
}