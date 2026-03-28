public class QuadraticEquationFactory extends EquationFactory {
    @Override
    public Equation createEquation(double[] coefficients) {
        return new QuadraticEquation(coefficients[0], coefficients[1], coefficients[2]);
    }
}
