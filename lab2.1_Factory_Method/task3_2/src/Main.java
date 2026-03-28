import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Main {
    private static final String[] INPUT_FILES = {
            "input/input01.txt",
            "input/input02.txt",
            "input/input03.txt"
    };

    public static void main(String[] args) throws IOException {
        EquationFactoryProvider factoryProvider = new EquationFactoryProvider();
        EquationFileReader fileReader = new EquationFileReader(factoryProvider);
        EquationAnalyzer analyzer = new EquationAnalyzer();

        for (String inputFile : INPUT_FILES) {
            List<Equation> equations = fileReader.readFromFile(inputFile);
            EquationAnalysisReport report = analyzer.analyze(equations);

            String header = "Результати для файлу " + inputFile + System.lineSeparator()
                    + "========================================" + System.lineSeparator() + System.lineSeparator();
            String reportText = header + report;

            String outputFileName = "out/" + Path.of(inputFile).getFileName().toString().replace("input", "output");
            Files.writeString(Path.of(outputFileName), reportText, StandardCharsets.UTF_8);

            System.out.println(reportText);
            System.out.println();
        }
    }
}
