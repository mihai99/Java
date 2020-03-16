import java.util.List;
import java.util.Objects;

public class Hospital implements Comparable{
    private String name;

    private List<Resident> preferences;
    private int capacity;

    public Hospital(String name,  int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public Hospital(String name, List<Resident> preferences, int capacity) {
        this.name = name;
        this.preferences = preferences;
        this.capacity = capacity;
    }

    public List<Resident> getPreferences() {
        return preferences;
    }

    public void setPreferences(List<Resident> preferences) {
        this.preferences = preferences;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getHospitalWithCapacity() {
        return "Hospital " + name + " with capacity: " + capacity;
    }

    @Override
    public String toString() {
        return getName();
    }

    @Override
    public int compareTo(Object o) {
        if (this == o) return 0;
        return name.compareTo(((Hospital) o).getName());
    }
}
