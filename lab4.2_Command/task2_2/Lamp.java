public class Lamp {
    private boolean isOn = false;

    public void lightOn() {
        if (!isOn) {
            isOn = true;
            System.out.println("Світильник увімкнено");
        } else {
            System.out.println("Світильник вже увімкнено");
        }
    }

    public void lightOff() {
        if (isOn) {
            isOn = false;
            System.out.println("Світильник вимкнено");
        } else {
            System.out.println("Світильник вже вимкнено");
        }
    }
}