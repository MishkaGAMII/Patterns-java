public interface CoffeeMachineFactory {
    CoffeeMachine createCoffeeMachine();
    Coffee createEspresso();
    Coffee createAmericano();
    Coffee createCappuccino();
    Coffee createLatte();
}
