public class ScoreUI implements GameObserver {
    @Override
    public void updateScore(int score) {
        System.out.println("[UI] Рахунок оновлено. Поточні бали: " + score);
    }
}