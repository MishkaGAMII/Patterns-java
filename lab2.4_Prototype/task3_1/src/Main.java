import java.util.List;

public class Main {
    public static void main(String[] args) {
        Equation linearEquation = new Equation(2, 4);
        Equation linearEquationCopy = linearEquation.cloneEquation();

        QuadraticEquation quadraticEquation = new QuadraticEquation(1, -3, 2);
        QuadraticEquation quadraticEquationCopy = quadraticEquation.cloneEquation();

        BiQuadraticEquation biQuadraticEquation = new BiQuadraticEquation(1, -5, 4);
        BiQuadraticEquation biQuadraticEquationCopy = biQuadraticEquation.cloneEquation();

        printEquation(linearEquation);
        printEquation(linearEquationCopy);
        System.out.println();

        printEquation(quadraticEquation);
        printEquation(quadraticEquationCopy);
        System.out.println();

        printEquation(biQuadraticEquation);
        printEquation(biQuadraticEquationCopy);
    }

    private static void printEquation(Equation equation) {
        System.out.println("Рівняння: " + equation);
        System.out.println("Розв'язки: " + formatSolutions(equation.solve()));
    }

    private static String formatSolutions(List<Double> solutions) {
        if (solutions == null) {
            return "нескінченна кількість";
        }

        if (solutions.isEmpty()) {
            return "розв'язків немає";
        }

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < solutions.size(); i++) {
            if (i > 0) {
                builder.append(", ");
            }
            double value = solutions.get(i);
            if (Math.abs(value - Math.rint(value)) < Equation.EPS) {
                builder.append(String.format("%.0f", value));
            } else {
                builder.append(value);
            }
        }
        return builder.toString();
    }
}
