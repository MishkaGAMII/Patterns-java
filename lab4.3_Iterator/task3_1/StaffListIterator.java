import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class StaffListIterator implements Iterator<Employee> {

    private final List<Employee> sortedEmployees;
    private int currentPosition = 0;

    public StaffListIterator(List<Employee> employees) {
        this.sortedEmployees = new ArrayList<>(employees);
        this.sortedEmployees.sort(Comparator.comparing(Employee::getName));
    }

    @Override
    public boolean hasNext() {
        return currentPosition < sortedEmployees.size();
    }

    @Override
    public Employee next() {
        return sortedEmployees.get(currentPosition++);
    }
}