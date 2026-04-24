public class ControlTower implements Mediator {

    private Runway runway;
    private PlanesInFlight planesInFlight;
    private PlanesOnGround planesOnGround;

    public ControlTower(Runway runway, PlanesInFlight planesInFlight, PlanesOnGround planesOnGround) {
        this.runway = runway;
        this.planesInFlight = planesInFlight;
        this.planesOnGround = planesOnGround;
    }

    @Override
    public void registerPlane(Plane plane) {
        planesOnGround.addPlane(plane);
        plane.setMediator(this);
    }

    @Override
    public void takeOff(Plane plane) {
        if (!plane.getIsInTheAir() && runway.getIsAvailable()) {
            System.out.println("Plane " + plane.getId() + " is taking off...");
            planesOnGround.removePlane(plane);
            planesInFlight.addPlane(plane);
            plane.setIsInTheAir(true);
            runway.setIsAvailable(false);
        } else {
            System.out.println("Plane " + plane.getId() + " cannot take off. Runway is busy or plane is already in the air.");
        }
    }
}