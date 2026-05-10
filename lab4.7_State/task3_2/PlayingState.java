public class PlayingState implements State {

    @Override
    public void play(MediaPlayer player) {
        System.out.println("Вже відтворюється: " + player.getCurrentTrack());
    }

    @Override
    public void pause(MediaPlayer player) {
        player.setState(new PausedState());
        System.out.println("Трек на паузі: " + player.getCurrentTrack());
    }

    @Override
    public void next(MediaPlayer player) {
        int nextTrack = (player.getCurrentTrackNum() + 1) % player.getTracks().size();
        player.setTrackNum(nextTrack);
        System.out.println("Наступний трек: " + player.getCurrentTrack());
    }

    @Override
    public void prev(MediaPlayer player) {
        int prevTrack = player.getCurrentTrackNum() - 1;
        if (prevTrack < 0) {
            prevTrack = player.getTracks().size() - 1;
        }
        player.setTrackNum(prevTrack);
        System.out.println("Попередній трек: " + player.getCurrentTrack());
    }

    @Override
    public void stop(MediaPlayer player) {
        player.setState(new StoppedState());
        player.setTrackNum(0);
        System.out.println("Відтворення зупинено.");
    }
}