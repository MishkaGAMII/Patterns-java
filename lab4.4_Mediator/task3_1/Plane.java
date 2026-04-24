public class Plane {

    private boolean isInTheAir;
    private int id;
    private Mediator mediator;

    public Plane(int id) {
        this.id = id;
        this.isInTheAir = false;
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public void takeOff() {
        if (mediator != null) {
            mediator.takeOff(this); 
        } else {
            System.out.println("No communication with the control tower!");
        }
    }

    public boolean getIsInTheAir() {
        return isInTheAir;
    }

    public void setIsInTheAir(boolean isInTheAir) {
        this.isInTheAir = isInTheAir;
    }

    public int getId() {
        return id;
    }
}