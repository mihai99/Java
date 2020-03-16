import java.util.List;
import java.util.Set;

public class ProblemInstance {
    private List<Resident> residentList;
    private Set<Hospital> hospitalSet;

    public ProblemInstance(List<Resident> residentList, Set<Hospital> hospitalSet) {
        this.residentList = residentList;
        this.hospitalSet = hospitalSet;
    }

    public List<Resident> getResidentList() {
        return residentList;
    }

    public Set<Hospital> getHospitalSet() {
        return hospitalSet;
    }
}
