public class BiQuadraticEquationFactory extends EquationFactory {
    @Override
    public Equation createEquation(double[] coefficients) {
        return new BiQuadraticEquation(
                coefficients[0],
                coefficients[1],
                coefficients[2],
                coefficients[3],
                coefficients[4]
        );
    }
}
