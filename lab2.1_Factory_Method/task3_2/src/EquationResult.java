import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EquationResult {
    private final boolean infiniteSolutions;
    private final List<Double> roots;

    private EquationResult(boolean infiniteSolutions, List<Double> roots) {
        this.infiniteSolutions = infiniteSolutions;
        this.roots = roots;
    }

    public static EquationResult infinite() {
        return new EquationResult(true, Collections.emptyList());
    }

    public static EquationResult finite(List<Double> roots) {
        List<Double> sortedRoots = new ArrayList<>(roots);
        Collections.sort(sortedRoots);
        return new EquationResult(false, Collections.unmodifiableList(sortedRoots));
    }

    public boolean hasInfiniteSolutions() {
        return infiniteSolutions;
    }

    public List<Double> getRoots() {
        return roots;
    }

    public int getRootsCount() {
        return infiniteSolutions ? -1 : roots.size();
    }
}
