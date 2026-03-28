import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.List;
import java.util.Locale;

public final class EquationFormatter {
    private static final DecimalFormat FORMAT;

    static {
        DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.US);
        FORMAT = new DecimalFormat("0.##########", symbols);
    }

    private EquationFormatter() {
    }

    public static String format(double[] coefficients) {
        if (coefficients.length == 2) {
            return formatLinear(coefficients[0], coefficients[1]);
        }
        if (coefficients.length == 3) {
            return formatQuadratic(coefficients[0], coefficients[1], coefficients[2]);
        }
        if (coefficients.length == 5) {
            return formatBiQuadratic(coefficients[0], coefficients[2], coefficients[4]);
        }
        throw new IllegalArgumentException("Непідтримувана кількість коефіцієнтів: " + coefficients.length);
    }

    public static String formatRoots(List<Double> roots) {
        StringBuilder builder = new StringBuilder("x = ");
        for (int i = 0; i < roots.size(); i++) {
            if (i > 0) {
                builder.append(", ");
            }
            builder.append(formatNumber(roots.get(i)));
        }
        return builder.toString();
    }

    private static String formatLinear(double b, double c) {
        return formatTerm(b, "x", true) + formatTerm(c, "", false) + " = 0";
    }

    private static String formatQuadratic(double a, double b, double c) {
        return formatTerm(a, "x^2", true) + formatTerm(b, "x", false) + formatTerm(c, "", false) + " = 0";
    }

    private static String formatBiQuadratic(double a, double b, double c) {
        return formatTerm(a, "x^4", true) + formatTerm(b, "x^2", false) + formatTerm(c, "", false) + " = 0";
    }

    private static String formatTerm(double coefficient, String variable, boolean first) {
        if (Math.abs(coefficient) < Equation.EPS) {
            if (first) {
                return "0";
            }
            return "";
        }

        String sign = coefficient < 0 ? (first ? "-" : " - ") : (first ? "" : " + ");
        double absValue = Math.abs(coefficient);

        if (!variable.isEmpty() && Math.abs(absValue - 1.0) < Equation.EPS) {
            return sign + variable;
        }

        return sign + formatNumber(absValue) + variable;
    }

    private static String formatNumber(double value) {
        if (Math.abs(value) < Equation.EPS) {
            return "0";
        }
        return FORMAT.format(value);
    }
}
