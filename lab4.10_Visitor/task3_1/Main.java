public class Main {
    public static void main(String[] args) {
        GameCharacter pirate = new Pirate();
        pirate.defendAgainstAttack();

        GameCharacter troll = new Troll();
        troll.defendAgainstAttack();
    }
}