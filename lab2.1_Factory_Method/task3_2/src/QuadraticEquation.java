import java.util.ArrayList;
import java.util.List;

public class QuadraticEquation extends Equation {
    public QuadraticEquation(double... coefficients) {
        super(coefficients);
    }

    @Override
    public EquationResult solve() {
        double a = coefficients[0];
        double b = coefficients[1];
        double c = coefficients[2];

        if (isZero(a)) {
            return new Equation(b, c).solve();
        }

        double discriminant = b * b - 4 * a * c;
        if (discriminant < -EPS) {
            return EquationResult.finite(List.of());
        }

        List<Double> roots = new ArrayList<>();
        if (isZero(discriminant)) {
            addDistinctRoot(roots, -b / (2 * a));
        } else {
            double sqrtDiscriminant = Math.sqrt(discriminant);
            addDistinctRoot(roots, (-b - sqrtDiscriminant) / (2 * a));
            addDistinctRoot(roots, (-b + sqrtDiscriminant) / (2 * a));
        }

        return EquationResult.finite(roots);
    }
}
