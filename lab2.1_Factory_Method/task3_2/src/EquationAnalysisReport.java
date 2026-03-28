import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class EquationAnalysisReport {
    private final Map<String, List<String>> groups = new LinkedHashMap<>();
    private String equationWithSmallestSingleRoot = "немає";
    private String equationWithLargestSingleRoot = "немає";

    public EquationAnalysisReport() {
        groups.put("Не мають розв'язків", new ArrayList<>());
        groups.put("Мають 1 розв'язок", new ArrayList<>());
        groups.put("Мають 2 розв'язки", new ArrayList<>());
        groups.put("Мають 3 розв'язки", new ArrayList<>());
        groups.put("Мають 4 розв'язки", new ArrayList<>());
        groups.put("Мають нескінченну кількість розв'язків", new ArrayList<>());
    }

    public void addNoSolutions(String value) {
        groups.get("Не мають розв'язків").add(value);
    }

    public void addOneSolution(String value) {
        groups.get("Мають 1 розв'язок").add(value);
    }

    public void addTwoSolutions(String value) {
        groups.get("Мають 2 розв'язки").add(value);
    }

    public void addThreeSolutions(String value) {
        groups.get("Мають 3 розв'язки").add(value);
    }

    public void addFourSolutions(String value) {
        groups.get("Мають 4 розв'язки").add(value);
    }

    public void addInfiniteSolutions(String value) {
        groups.get("Мають нескінченну кількість розв'язків").add(value);
    }

    public void setEquationWithSmallestSingleRoot(String value) {
        equationWithSmallestSingleRoot = value;
    }

    public void setEquationWithLargestSingleRoot(String value) {
        equationWithLargestSingleRoot = value;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (Map.Entry<String, List<String>> entry : groups.entrySet()) {
            builder.append(entry.getKey()).append(":\n");
            if (entry.getValue().isEmpty()) {
                builder.append("  немає\n");
            } else {
                for (String value : entry.getValue()) {
                    builder.append("  ").append(value).append("\n");
                }
            }
            builder.append("\n");
        }

        builder.append("Рівняння з найменшим розв'язком серед рівнянь з одним розв'язком:\n");
        builder.append("  ").append(equationWithSmallestSingleRoot).append("\n\n");
        builder.append("Рівняння з найбільшим розв'язком серед рівнянь з одним розв'язком:\n");
        builder.append("  ").append(equationWithLargestSingleRoot).append("\n");

        return builder.toString();
    }
}
