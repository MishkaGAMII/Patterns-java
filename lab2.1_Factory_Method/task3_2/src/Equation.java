import java.util.List;

public class Equation {
    protected static final double EPS = 1e-9;
    protected final double[] coefficients;

    public Equation(double... coefficients) {
        this.coefficients = coefficients.clone();
    }

    public EquationResult solve() {
        double b = coefficients[0];
        double c = coefficients[1];

        if (isZero(b)) {
            if (isZero(c)) {
                return EquationResult.infinite();
            }
            return EquationResult.finite(List.of());
        }

        return EquationResult.finite(List.of(normalizeZero(-c / b)));
    }

    protected boolean isZero(double value) {
        return Math.abs(value) < EPS;
    }

    protected double normalizeZero(double value) {
        return isZero(value) ? 0.0 : value;
    }

    protected void addDistinctRoot(List<Double> roots, double root) {
        double normalizedRoot = normalizeZero(root);
        for (double existingRoot : roots) {
            if (Math.abs(existingRoot - normalizedRoot) < EPS) {
                return;
            }
        }
        roots.add(normalizedRoot);
    }

    @Override
    public String toString() {
        return EquationFormatter.format(coefficients);
    }
}
