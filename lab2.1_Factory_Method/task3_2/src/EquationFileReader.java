import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class EquationFileReader {
    private final EquationFactoryProvider factoryProvider;

    public EquationFileReader(EquationFactoryProvider factoryProvider) {
        this.factoryProvider = factoryProvider;
    }

    public List<Equation> readFromFile(String fileName) throws IOException {
        List<Equation> equations = new ArrayList<>();
        List<String> lines = Files.readAllLines(Path.of(fileName));

        for (String line : lines) {
            String trimmedLine = line.trim();
            if (trimmedLine.isEmpty()) {
                continue;
            }

            String[] parts = trimmedLine.split("\\s+");
            double[] coefficients = new double[parts.length];
            for (int i = 0; i < parts.length; i++) {
                coefficients[i] = Double.parseDouble(parts[i]);
            }

            equations.add(factoryProvider.createEquation(coefficients));
        }

        return equations;
    }
}
