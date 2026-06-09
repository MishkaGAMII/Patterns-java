public class Main {
    public static void main(String[] args) {
        System.out.println("=== Ініціалізація Аркадної Гри ===");
        
        // Налаштування рушія та інтерфейсу
        GameEngine engine = GameEngine.getInstance();
        engine.addObserver(new ScoreUI());

        // Запуск першого рівня
        System.out.println("\n--- Рівень 1: Неонове місто ---");
        LevelFactory sciFiFactory = new SciFiLevelFactory();
        GameCharacter hero1 = sciFiFactory.createHero();
        Enemy enemy1 = sciFiFactory.createEnemy();
        
        hero1.render();
        enemy1.render();
        hero1.performAttack();
        
        System.out.println("-> Ворога знищено!");
        engine.addScore(100);

        // Перехід на другий рівень
        System.out.println("\n--- Рівень 2: Зона відчуження ---");
        LevelFactory apocFactory = new ApocalypseLevelFactory();
        GameCharacter hero2 = apocFactory.createHero();
        Enemy enemy2 = apocFactory.createEnemy();
        
        hero2.render();
        enemy2.render();
        hero2.performAttack();
        
        System.out.println("-> Ворога знищено!");
        engine.addScore(250);
    }
}