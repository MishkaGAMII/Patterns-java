import java.util.ArrayList;
import java.util.List;

public class EquationParser {
    public Equation parse(String line) {
        String trimmed = line.trim();
        if (trimmed.isEmpty()) {
            throw new IllegalArgumentException("Порожній рядок не містить коефіцієнтів.");
        }

        String[] parts = trimmed.split("\\s+");
        List<Double> coefficients = new ArrayList<>();
        for (String part : parts) {
            coefficients.add(Double.parseDouble(part));
        }

        if (coefficients.size() == 2) {
            return new Equation(coefficients.get(0), coefficients.get(1), trimmed);
        }

        if (coefficients.size() == 3) {
            return new QuadraticEquation(coefficients.get(0), coefficients.get(1), coefficients.get(2), trimmed);
        }

        if (coefficients.size() == 5) {
            if (!Equation.isZero(coefficients.get(1)) || !Equation.isZero(coefficients.get(3))) {
                throw new IllegalArgumentException("Рядок не описує біквадратне рівняння: " + trimmed);
            }
            return new BiQuadraticEquation(coefficients.get(0), coefficients.get(2), coefficients.get(4), trimmed);
        }

        throw new IllegalArgumentException("Непідтримуваний формат рівняння: " + trimmed);
    }
}
