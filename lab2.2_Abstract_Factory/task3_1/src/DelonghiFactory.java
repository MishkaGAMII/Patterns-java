public class DelonghiFactory implements CoffeeMachineFactory {
    @Override
    public CoffeeMachine createCoffeeMachine() {
        return new DelonghiCoffeeMachine();
    }

    @Override
    public Coffee createEspresso() {
        return new DelonghiEspresso();
    }

    @Override
    public Coffee createAmericano() {
        return new DelonghiAmericano();
    }

    @Override
    public Coffee createCappuccino() {
        return new DelonghiCappuccino();
    }

    @Override
    public Coffee createLatte() {
        return new DelonghiLatte();
    }
}
