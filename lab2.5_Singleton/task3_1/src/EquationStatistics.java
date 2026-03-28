import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class EquationStatistics {
    private final Map<String, List<String>> groups = new LinkedHashMap<>();
    private String smallestSingleRootEquation;
    private Double smallestSingleRoot;
    private String largestSingleRootEquation;
    private Double largestSingleRoot;

    public EquationStatistics() {
        groups.put("Не мають розв'язків", new ArrayList<>());
        groups.put("Мають один розв'язок", new ArrayList<>());
        groups.put("Мають два розв'язки", new ArrayList<>());
        groups.put("Мають три розв'язки", new ArrayList<>());
        groups.put("Мають чотири розв'язки", new ArrayList<>());
        groups.put("Мають нескінченну кількість розв'язків", new ArrayList<>());
    }

    public void addEquation(Equation equation) {
        if (equation.hasInfiniteSolutions()) {
            groups.get("Мають нескінченну кількість розв'язків")
                    .add(equation + "    |    коефіцієнти: [" + equation.getSourceLine() + "]");
            return;
        }

        List<Double> roots = equation.solve();
        String description = equation + "    |    корені: " + formatRoots(roots)
                + "    |    коефіцієнти: [" + equation.getSourceLine() + "]";

        switch (roots.size()) {
            case 0 -> groups.get("Не мають розв'язків").add(description);
            case 1 -> {
                groups.get("Мають один розв'язок").add(description);
                updateSingleRootExtremes(equation, roots.get(0));
            }
            case 2 -> groups.get("Мають два розв'язки").add(description);
            case 3 -> groups.get("Мають три розв'язки").add(description);
            case 4 -> groups.get("Мають чотири розв'язки").add(description);
            default -> throw new IllegalStateException("Неочікувана кількість коренів: " + roots.size());
        }
    }

    public String buildReport(String fileName) {
        StringBuilder builder = new StringBuilder();
        builder.append("==============================\n");
        builder.append("Файл: ").append(fileName).append("\n");
        builder.append("==============================\n");

        for (Map.Entry<String, List<String>> entry : groups.entrySet()) {
            builder.append(entry.getKey())
                    .append(" (")
                    .append(entry.getValue().size())
                    .append("):\n");
            if (entry.getValue().isEmpty()) {
                builder.append("  - немає\n");
            } else {
                for (String value : entry.getValue()) {
                    builder.append("  - ").append(value).append("\n");
                }
            }
            builder.append("\n");
        }

        builder.append("Серед рівнянь з рівно одним розв'язком:\n");
        if (smallestSingleRoot == null) {
            builder.append("  - таких рівнянь немає\n");
        } else {
            builder.append("  - найменший розв'язок: ")
                    .append(Equation.formatNumber(smallestSingleRoot))
                    .append("    |    ")
                    .append(smallestSingleRootEquation)
                    .append("\n");
            builder.append("  - найбільший розв'язок: ")
                    .append(Equation.formatNumber(largestSingleRoot))
                    .append("    |    ")
                    .append(largestSingleRootEquation)
                    .append("\n");
        }

        return builder.toString();
    }

    private void updateSingleRootExtremes(Equation equation, double root) {
        if (smallestSingleRoot == null || root < smallestSingleRoot) {
            smallestSingleRoot = root;
            smallestSingleRootEquation = equation.toString() + "    |    коефіцієнти: [" + equation.getSourceLine() + "]";
        }

        if (largestSingleRoot == null || root > largestSingleRoot) {
            largestSingleRoot = root;
            largestSingleRootEquation = equation.toString() + "    |    коефіцієнти: [" + equation.getSourceLine() + "]";
        }
    }

    private String formatRoots(List<Double> roots) {
        if (roots.isEmpty()) {
            return "[]";
        }
        List<String> formatted = new ArrayList<>();
        for (double root : roots) {
            formatted.add(Equation.formatNumber(root));
        }
        return formatted.toString();
    }
}
