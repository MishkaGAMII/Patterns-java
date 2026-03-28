public class SaecoFactory implements CoffeeMachineFactory {
    @Override
    public CoffeeMachine createCoffeeMachine() {
        return new SaecoCoffeeMachine();
    }

    @Override
    public Coffee createEspresso() {
        return new SaecoEspresso();
    }

    @Override
    public Coffee createAmericano() {
        return new SaecoAmericano();
    }

    @Override
    public Coffee createCappuccino() {
        return new SaecoCappuccino();
    }

    @Override
    public Coffee createLatte() {
        return new SaecoLatte();
    }
}
