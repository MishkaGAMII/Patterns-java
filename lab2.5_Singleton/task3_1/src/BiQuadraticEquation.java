import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BiQuadraticEquation extends Equation {
    private final double a;

    public BiQuadraticEquation(double a, double b, double c) {
        this(a, b, c, null);
    }

    public BiQuadraticEquation(double a, double b, double c, String sourceLine) {
        super(b, c, sourceLine);
        this.a = normalizeZero(a);
    }

    protected BiQuadraticEquation(BiQuadraticEquation other) {
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

        QuadraticEquation yEquation = new QuadraticEquation(a, getB(), getC(), getSourceLine());
        if (yEquation.hasInfiniteSolutions()) {
            return Collections.emptyList();
        }

        List<Double> yRoots = yEquation.solve();
        List<Double> roots = new ArrayList<>();

        for (double y : yRoots) {
            double normalizedY = normalizeZero(y);
            if (normalizedY < 0) {
                continue;
            }
            if (isZero(normalizedY)) {
                addUniqueRoot(roots, 0.0);
            } else {
                double x = Math.sqrt(normalizedY);
                addUniqueRoot(roots, -x);
                addUniqueRoot(roots, x);
            }
        }

        roots.sort(Double::compareTo);
        return roots;
    }

    @Override
    public boolean hasInfiniteSolutions() {
        return isZero(a) && isZero(getB()) && isZero(getC());
    }

    @Override
    public BiQuadraticEquation copy() {
        return new BiQuadraticEquation(this);
    }

    @Override
    public String toString() {
        return formatEquation(new double[]{a, 0.0, getB(), 0.0, getC()});
    }

    private static void addUniqueRoot(List<Double> roots, double candidate) {
        double normalizedCandidate = normalizeZero(candidate);
        for (double root : roots) {
            if (Math.abs(root - normalizedCandidate) < EPS) {
                return;
            }
        }
        roots.add(normalizedCandidate);
    }
}
