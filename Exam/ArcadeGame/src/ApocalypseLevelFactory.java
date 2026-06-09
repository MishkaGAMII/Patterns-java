public class ApocalypseLevelFactory implements LevelFactory {
    @Override
    public GameCharacter createHero() {
        return new GameCharacter(new RangedAttack()) {
            @Override
            public void render() { 
                System.out.println("Створено героя: Дослідник Зони (Постапокаліпсис)"); 
            }
        };
    }
    
    @Override
    public Enemy createEnemy() {
        return new Enemy() {
            @Override
            public void render() { 
                System.out.println("Створено ворога: Мутант-кровосос"); 
            }
        };
    }
}