public class Pirate extends Defender {

    @Override
    protected void pickUpWeapon() {
        System.out.println("Pick up sword");
    }

    @Override
    protected void defenseAction() {
        System.out.println("Defend with sword");
    }

    @Override
    protected void moveToSafety() {
        System.out.println("Return to the ship");
    }

}