import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class QuadraticEquation extends Equation {
    private final double a;

    public QuadraticEquation(double a, double b, double c) {
        this(a, b, c, null);
    }

    public QuadraticEquation(double a, double b, double c, String sourceLine) {
        super(b, c, sourceLine);
        this.a = normalizeZero(a);
    }

    protected QuadraticEquation(QuadraticEquation other) {
        super(other);
        this.a = other.a;
    }

    public double getA() {
        return a;
    }

    @Override
    public List<Double> solve() {
        if (hasInfiniteSolutions()) {
            return Collections.emptyList();
        }

        if (isZero(a)) {
            return new Equation(getB(), getC(), getSourceLine()).solve();
        }

        double discriminant = normalizeZero(getB() * getB() - 4.0 * a * getC());
        if (discriminant < 0) {
            return Collections.emptyList();
        }

        List<Double> roots = new ArrayList<>();
        if (isZero(discriminant)) {
            roots.add(normalizeZero(-getB() / (2.0 * a)));
            return roots;
        }

        double sqrtD = Math.sqrt(discriminant);
        roots.add(normalizeZero((-getB() - sqrtD) / (2.0 * a)));
        roots.add(normalizeZero((-getB() + sqrtD) / (2.0 * a)));
        roots.sort(Double::compareTo);
        return roots;
    }

    @Override
    public boolean hasInfiniteSolutions() {
        if (!isZero(a)) {
            return false;
        }
        return new Equation(getB(), getC(), getSourceLine()).hasInfiniteSolutions();
    }

    @Override
    public QuadraticEquation copy() {
        return new QuadraticEquation(this);
    }

    @Override
    public String toString() {
        return formatEquation(new double[]{a, getB(), getC()});
    }
}
