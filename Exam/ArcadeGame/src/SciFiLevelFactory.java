public class SciFiLevelFactory implements LevelFactory {
    @Override
    public GameCharacter createHero() {
        return new GameCharacter(new MeleeAttack()) {
            @Override
            public void render() { 
                System.out.println("Створено героя: Кібер-ніндзя (Sci-Fi рівень)"); 
            }
        };
    }
    
    @Override
    public Enemy createEnemy() {
        return new Enemy() {
            @Override
            public void render() { 
                System.out.println("Створено ворога: Охоронець корпорації"); 
            }
        };
    }
}