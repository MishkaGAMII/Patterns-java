public abstract class GameCharacter {
    protected AttackStrategy attackStrategy;
    
    public GameCharacter(AttackStrategy attackStrategy) { 
        this.attackStrategy = attackStrategy; 
    }
    
    public void performAttack() { 
        attackStrategy.attack(); 
    }
    
    public abstract void render();
}