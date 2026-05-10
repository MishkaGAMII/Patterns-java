public class PausedState implements State {

    @Override
    public void play(MediaPlayer player) {
        player.setState(new PlayingState());
        System.out.println("Відновлено відтворення: " + player.getCurrentTrack());
    }

    @Override
    public void pause(MediaPlayer player) {
        System.out.println("Вже на паузі.");
    }

    @Override
    public void next(MediaPlayer player) {
        int nextTrack = (player.getCurrentTrackNum() + 1) % player.getTracks().size();
        player.setTrackNum(nextTrack);
        System.out.println("Перемикнуто на наступний трек (на паузі): " + player.getCurrentTrack());
    }

    @Override
    public void prev(MediaPlayer player) {
        int prevTrack = player.getCurrentTrackNum() - 1;
        if (prevTrack < 0) {
            prevTrack = player.getTracks().size() - 1;
        }
        player.setTrackNum(prevTrack);
        System.out.println("Перемикнуто на попередній трек (на паузі): " + player.getCurrentTrack());
    }

    @Override
    public void stop(MediaPlayer player) {
        player.setState(new StoppedState());
        player.setTrackNum(0);
        System.out.println("Відтворення зупинено.");
    }
}