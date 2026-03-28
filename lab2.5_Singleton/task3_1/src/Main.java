import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Main {
    private static final String[] DEFAULT_INPUT_FILES = {
            "data/input01.txt",
            "data/input02.txt",
            "data/input03.txt"
    };

    public static void main(String[] args) {
        String[] inputFiles = args.length == 0 ? DEFAULT_INPUT_FILES : args;
        EquationParser parser = new EquationParser();

        for (String inputFile : inputFiles) {
            try {
                List<Equation> equations = readEquations(inputFile, parser);

                // Використання шаблону Прототип.
                List<Equation> equationCopies = new ArrayList<>();
                for (Equation equation : equations) {
                    equationCopies.add(equation.copy());
                }

                EquationStatistics statistics = new EquationStatistics();
                for (Equation equation : equationCopies) {
                    statistics.addEquation(equation);
                }

                System.out.println(statistics.buildReport(inputFile));
            } catch (IOException e) {
                System.out.println("Не вдалося прочитати файл: " + inputFile);
                System.out.println(e.getMessage());
            } catch (IllegalArgumentException e) {
                System.out.println("Помилка у файлі: " + inputFile);
                System.out.println(e.getMessage());
            }
        }
    }

    private static List<Equation> readEquations(String fileName, EquationParser parser) throws IOException {
        List<Equation> equations = new ArrayList<>();
        List<String> lines = Files.readAllLines(Path.of(fileName));

        for (String line : lines) {
            if (line.trim().isEmpty()) {
                continue;
            }
            equations.add(parser.parse(line));
        }

        return equations;
    }
}
