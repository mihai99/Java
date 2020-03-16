import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class Resident implements Comparable{
    private String name;
    private List<Hospital> preferences;

    public Resident(String name, List<Hospital> preferences) {
        this.name = name;
        this.preferences = preferences;
    }

    public List<Hospital> getPreferences() {
        return preferences;
    }

    public String getName() {
        return name;
    }

    public String getRsidentWithPreferances() {
        AtomicReference<String> result = new AtomicReference<>("Resident " + getName() + " with preferances ");
        preferences.forEach(x -> {
            result.set(result + " " + x.getName());
        });
        return result.toString();
    }
    @Override
    public String toString() {
        return getName();
    }

    @Override
    public int compareTo(Object o) {
        if (this == o) return 0;
        return name.compareTo(((Resident) o).getName());
    }
}
