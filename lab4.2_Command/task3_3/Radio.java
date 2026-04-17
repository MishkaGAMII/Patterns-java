public class Radio implements Device {
    private int volume = 20;
    private int chanel = 100;
    private boolean isOn = false;

    @Override public void on() { if(isOn) return; isOn = true; System.out.println("Radio is ON"); }
    @Override public void off() { if(!isOn) return; isOn = false; System.out.println("Radio is OFF"); }
    @Override public void volumeUp() { if(!isOn) return; System.out.println("Radio Volume = " + (++volume)); }
    @Override public void volumeDown() { if(!isOn) return; System.out.println("Radio Volume = " + (--volume)); }
    @Override public void nextChanel() { if(!isOn) return; System.out.println("Radio Frequency = " + (++chanel)); }
    @Override public void prevChanel() { if(!isOn) return; System.out.println("Radio Frequency = " + (--chanel)); }
}