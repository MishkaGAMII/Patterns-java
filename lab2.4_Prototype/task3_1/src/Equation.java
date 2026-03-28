import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Equation {
    protected double b;
    protected double c;
    protected static final double EPS = 1e-9;

    public Equation(double b, double c) {
        this.b = b;
        this.c = c;
    }

    public Equation(Equation other) {
        this.b = other.b;
        this.c = other.c;
    }

    public Equation cloneEquation() {
        return new Equation(this);
    }

    public List<Double> solve() {
        if (isZero(b) && isZero(c)) {
            return null;
        }

        if (isZero(b)) {
            return Collections.emptyList();
        }

        List<Double> solutions = new ArrayList<>();
        solutions.add(normalize(-c / b));
        return solutions;
    }

    protected boolean isZero(double value) {
        return Math.abs(value) < EPS;
    }

    protected double normalize(double value) {
        if (isZero(value)) {
            return 0.0;
        }
        return value;
    }

    protected void addIfAbsent(List<Double> values, double value) {
        double normalizedValue = normalize(value);
        for (double currentValue : values) {
            if (isZero(currentValue - normalizedValue)) {
                return;
            }
        }
        values.add(normalizedValue);
    }

    protected String formatCoefficient(double value) {
        double normalizedValue = normalize(value);
        if (Math.abs(normalizedValue - Math.rint(normalizedValue)) < EPS) {
            return String.format("%.0f", normalizedValue);
        }
        return String.valueOf(normalizedValue);
    }

    @Override
    public String toString() {
        return formatCoefficient(b) + "x + " + formatCoefficient(c) + " = 0";
    }
}
