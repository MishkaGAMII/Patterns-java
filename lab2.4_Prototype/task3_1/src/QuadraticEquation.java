import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class QuadraticEquation extends Equation {
    protected double a;

    public QuadraticEquation(double a, double b, double c) {
        super(b, c);
        this.a = a;
    }

    public QuadraticEquation(QuadraticEquation other) {
        super(other);
        this.a = other.a;
    }

    @Override
    public QuadraticEquation cloneEquation() {
        return new QuadraticEquation(this);
    }

    @Override
    public List<Double> solve() {
        if (isZero(a)) {
            return super.solve();
        }

        double discriminant = b * b - 4 * a * c;
        if (discriminant < -EPS) {
            return Collections.emptyList();
        }

        List<Double> solutions = new ArrayList<>();
        if (isZero(discriminant)) {
            solutions.add(normalize(-b / (2 * a)));
            return solutions;
        }

        double sqrtDiscriminant = Math.sqrt(discriminant);
        addIfAbsent(solutions, (-b - sqrtDiscriminant) / (2 * a));
        addIfAbsent(solutions, (-b + sqrtDiscriminant) / (2 * a));
        Collections.sort(solutions);
        return solutions;
    }

    @Override
    public String toString() {
        return formatCoefficient(a) + "x^2 + " + formatCoefficient(b) + "x + " + formatCoefficient(c) + " = 0";
    }
}
