public class LinearEquationFactory extends EquationFactory {
    @Override
    public Equation createEquation(double[] coefficients) {
        return new Equation(coefficients[0], coefficients[1]);
    }
}
