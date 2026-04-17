public class Television implements Device {
    private int volume = 50;
    private int chanel = 1;
    private boolean isOn = false;

    @Override public void on() { if(isOn) return; isOn = true; System.out.println("Television is ON"); }
    @Override public void off() { if(!isOn) return; isOn = false; System.out.println("Television is OFF"); }
    @Override public void volumeUp() { if(!isOn) return; System.out.println("TV Volume = " + (++volume)); }
    @Override public void volumeDown() { if(!isOn) return; System.out.println("TV Volume = " + (--volume)); }
    @Override public void nextChanel() { if(!isOn) return; System.out.println("TV Chanel = " + (++chanel)); }
    @Override public void prevChanel() { if(!isOn) return; System.out.println("TV Chanel = " + (--chanel)); }
}