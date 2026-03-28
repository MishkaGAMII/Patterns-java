import java.util.List;

public class EquationAnalyzer {
    public EquationAnalysisReport analyze(List<Equation> equations) {
        EquationAnalysisReport report = new EquationAnalysisReport();

        Double minSingleRoot = null;
        Double maxSingleRoot = null;
        String minSingleRootEquation = null;
        String maxSingleRootEquation = null;

        for (Equation equation : equations) {
            EquationResult result = equation.solve();
            String formatted = formatEquationWithSolutions(equation, result);

            if (result.hasInfiniteSolutions()) {
                report.addInfiniteSolutions(formatted);
                continue;
            }

            int rootsCount = result.getRootsCount();
            switch (rootsCount) {
                case 0 -> report.addNoSolutions(formatted);
                case 1 -> {
                    report.addOneSolution(formatted);
                    double root = result.getRoots().get(0);
                    if (minSingleRoot == null || root < minSingleRoot) {
                        minSingleRoot = root;
                        minSingleRootEquation = formatted;
                    }
                    if (maxSingleRoot == null || root > maxSingleRoot) {
                        maxSingleRoot = root;
                        maxSingleRootEquation = formatted;
                    }
                }
                case 2 -> report.addTwoSolutions(formatted);
                case 3 -> report.addThreeSolutions(formatted);
                case 4 -> report.addFourSolutions(formatted);
                default -> throw new IllegalStateException("Невідома кількість коренів: " + rootsCount);
            }
        }

        if (minSingleRootEquation != null) {
            report.setEquationWithSmallestSingleRoot(minSingleRootEquation);
            report.setEquationWithLargestSingleRoot(maxSingleRootEquation);
        }

        return report;
    }

    private String formatEquationWithSolutions(Equation equation, EquationResult result) {
        if (result.hasInfiniteSolutions()) {
            return equation + " -> нескінченна кількість розв'язків";
        }
        if (result.getRoots().isEmpty()) {
            return equation + " -> розв'язків немає";
        }
        return equation + " -> " + EquationFormatter.formatRoots(result.getRoots());
    }
}
