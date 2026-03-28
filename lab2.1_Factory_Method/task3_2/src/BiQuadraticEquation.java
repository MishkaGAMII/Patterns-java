import java.util.ArrayList;
import java.util.List;

public class BiQuadraticEquation extends Equation {
    public BiQuadraticEquation(double... coefficients) {
        super(coefficients);
    }

    @Override
    public EquationResult solve() {
        double a = coefficients[0];
        double b = coefficients[2];
        double c = coefficients[4];

        if (isZero(a)) {
            return new QuadraticEquation(b, 0, c).solve();
        }

        EquationResult quadraticResult = new QuadraticEquation(a, b, c).solve();
        if (quadraticResult.hasInfiniteSolutions()) {
            return EquationResult.infinite();
        }

        List<Double> roots = new ArrayList<>();
        for (double y : quadraticResult.getRoots()) {
            if (y < -EPS) {
                continue;
            }
            if (isZero(y)) {
                addDistinctRoot(roots, 0.0);
            } else {
                double sqrtY = Math.sqrt(y);
                addDistinctRoot(roots, -sqrtY);
                addDistinctRoot(roots, sqrtY);
            }
        }

        return EquationResult.finite(roots);
    }
}
