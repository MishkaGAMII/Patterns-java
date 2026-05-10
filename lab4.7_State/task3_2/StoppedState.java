public class StoppedState implements State {

    @Override
    public void play(MediaPlayer player) {
        player.setState(new PlayingState());
        System.out.println("Відтворення: " + player.getCurrentTrack());
    }

    @Override
    public void pause(MediaPlayer player) {
        System.out.println("Плеєр зупинено. Пауза неможлива.");
    }

    @Override
    public void next(MediaPlayer player) {
        System.out.println("Плеєр зупинено. Неможливо перемикнути трек.");
    }

    @Override
    public void prev(MediaPlayer player) {
        System.out.println("Плеєр зупинено. Неможливо перемикнути трек.");
    }

    @Override
    public void stop(MediaPlayer player) {
        System.out.println("Плеєр вже зупинено.");
    }
}