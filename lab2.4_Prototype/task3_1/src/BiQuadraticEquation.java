import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BiQuadraticEquation extends QuadraticEquation {
    public BiQuadraticEquation(double a, double b, double c) {
        super(a, b, c);
    }

    public BiQuadraticEquation(BiQuadraticEquation other) {
        super(other);
    }

    @Override
    public BiQuadraticEquation cloneEquation() {
        return new BiQuadraticEquation(this);
    }

    @Override
    public List<Double> solve() {
        if (isZero(a)) {
            return new QuadraticEquation(b, 0, c).solve();
        }

        List<Double> ySolutions = new QuadraticEquation(a, b, c).solve();
        if (ySolutions == null) {
            return null;
        }

        List<Double> solutions = new ArrayList<>();
        for (double y : ySolutions) {
            if (y < -EPS) {
                continue;
            }

            if (isZero(y)) {
                addIfAbsent(solutions, 0.0);
                continue;
            }

            double root = Math.sqrt(y);
            addIfAbsent(solutions, -root);
            addIfAbsent(solutions, root);
        }

        Collections.sort(solutions);
        return solutions;
    }

    @Override
    public String toString() {
        return formatCoefficient(a) + "x^4 + " + formatCoefficient(b) + "x^2 + " + formatCoefficient(c) + " = 0";
    }
}
