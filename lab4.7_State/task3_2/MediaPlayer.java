import java.util.ArrayList;
import java.util.List;

public class MediaPlayer {

    final private List<String> tracks = new ArrayList<>();
    private State state;
    private int currentTrackNum = 0;

    public MediaPlayer() {
        this.state = new StoppedState();
    }

    public String getCurrentTrack() {
        if (tracks.isEmpty()) return null;
        return tracks.get(currentTrackNum);
    }

    public void setTrackNum(int trackNum) {
        if (trackNum < 0 || trackNum >= tracks.size()) {
            return;
        }
        this.currentTrackNum = trackNum;
    }

    public int getCurrentTrackNum() {
        return currentTrackNum;
    }

    public List<String> getTracks() {
        return tracks;
    }

    public void addTrack(String track) {
        tracks.add(track);
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public void play() {
        if (tracks.isEmpty()) return;
        state.play(this);
    }

    public void pause() {
        if (tracks.isEmpty()) return;
        state.pause(this);
    }

    public void next() {
        if (tracks.isEmpty()) return;
        state.next(this);
    }

    public void prev() {
        if (tracks.isEmpty()) return;
        state.prev(this);
    }

    public void stop() {
        if (tracks.isEmpty()) return;
        state.stop(this);
    }
}