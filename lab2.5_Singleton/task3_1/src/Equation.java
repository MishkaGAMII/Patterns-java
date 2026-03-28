import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

public class Equation implements ClonableEquation {
    protected static final double EPS = 1e-9;

    private final double b;
    private final double c;
    private final String sourceLine;

    public Equation(double b, double c) {
        this(b, c, null);
    }

    public Equation(double b, double c, String sourceLine) {
        this.b = normalizeZero(b);
        this.c = normalizeZero(c);
        this.sourceLine = sourceLine;
    }

    protected Equation(Equation other) {
        this.b = other.b;
        this.c = other.c;
        this.sourceLine = other.sourceLine;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public String getSourceLine() {
        return sourceLine;
    }

    public List<Double> solve() {
        if (hasInfiniteSolutions()) {
            return Collections.emptyList();
        }

        if (isZero(b)) {
            return Collections.emptyList();
        }

        List<Double> roots = new ArrayList<>();
        roots.add(normalizeZero(-c / b));
        return roots;
    }

    public boolean hasInfiniteSolutions() {
        return isZero(b) && isZero(c);
    }

    @Override
    public Equation copy() {
        return new Equation(this);
    }

    @Override
    public String toString() {
        return formatEquation(new double[]{b, c});
    }

    protected static boolean isZero(double value) {
        return Math.abs(value) < EPS;
    }

    protected static double normalizeZero(double value) {
        return isZero(value) ? 0.0 : value;
    }

    protected static String formatEquation(double[] coefficients) {
        StringBuilder builder = new StringBuilder();
        int degree = coefficients.length - 1;
        boolean hasPrintedTerm = false;

        for (int i = 0; i < coefficients.length; i++) {
            double coefficient = normalizeZero(coefficients[i]);
            int currentDegree = degree - i;

            if (isZero(coefficient)) {
                continue;
            }

            if (hasPrintedTerm) {
                builder.append(coefficient > 0 ? " + " : " - ");
            } else if (coefficient < 0) {
                builder.append("-");
            }

            double absValue = Math.abs(coefficient);
            boolean shouldPrintCoefficient = currentDegree == 0 || Math.abs(absValue - 1.0) > EPS;

            if (shouldPrintCoefficient) {
                builder.append(formatNumber(absValue));
            }

            if (currentDegree > 0) {
                builder.append("x");
                if (currentDegree > 1) {
                    builder.append("^").append(currentDegree);
                }
            }

            hasPrintedTerm = true;
        }

        if (!hasPrintedTerm) {
            builder.append("0");
        }

        builder.append(" = 0");
        return builder.toString();
    }

    protected static String formatNumber(double value) {
        double normalized = normalizeZero(value);
        if (Math.abs(normalized - Math.rint(normalized)) < EPS) {
            return String.format(Locale.US, "%.0f", Math.rint(normalized));
        }
        return String.format(Locale.US, "%.6f", normalized)
                .replaceAll("0+$", "")
                .replaceAll("\\.$", "");
    }
}
