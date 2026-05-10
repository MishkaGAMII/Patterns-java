public class PlayingState implements State {

    @Override
    public void play(MediaPlayer mediaPlayer) {
        // Нічого не робимо, вже відтворюється
    }

    @Override
    public void pause(MediaPlayer mediaPlayer) {
        mediaPlayer.setState(new PausedState());
        mediaPlayer.setIcon("play button");
        System.out.println("Video paused, icon set to " + mediaPlayer.getIcon());
    }

}