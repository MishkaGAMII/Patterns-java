public class PhilipsFactory implements CoffeeMachineFactory {
    @Override
    public CoffeeMachine createCoffeeMachine() {
        return new PhilipsCoffeeMachine();
    }

    @Override
    public Coffee createEspresso() {
        return new PhilipsEspresso();
    }

    @Override
    public Coffee createAmericano() {
        return new PhilipsAmericano();
    }

    @Override
    public Coffee createCappuccino() {
        return new PhilipsCappuccino();
    }

    @Override
    public Coffee createLatte() {
        return new PhilipsLatte();
    }
}
