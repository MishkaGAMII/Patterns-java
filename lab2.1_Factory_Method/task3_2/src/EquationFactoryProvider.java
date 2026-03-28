public class EquationFactoryProvider {
    private final EquationFactory linearFactory = new LinearEquationFactory();
    private final EquationFactory quadraticFactory = new QuadraticEquationFactory();
    private final EquationFactory biQuadraticFactory = new BiQuadraticEquationFactory();

    public Equation createEquation(double[] coefficients) {
        EquationFactory factory = switch (coefficients.length) {
            case 2 -> linearFactory;
            case 3 -> quadraticFactory;
            case 5 -> biQuadraticFactory;
            default -> throw new IllegalArgumentException(
                    "Непідтримуваний формат рівняння. Кількість коефіцієнтів: " + coefficients.length
            );
        };
        return factory.createEquation(coefficients);
    }
}
