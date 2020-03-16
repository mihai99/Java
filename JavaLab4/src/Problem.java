import java.sql.Array;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Problem {
    public static void main(String[] args) {
        List<Resident> residentList = Creator.createDefinedProblemInstance().getResidentList();
        Set<Hospital> hospitalSet = Creator.createDefinedProblemInstance().getHospitalSet();

        System.out.println("Residents with preferances: ");
        residentList.stream()
                .sorted(Comparator.comparing(x -> x.getName()))
                .forEach(x -> System.out.println(x.getRsidentWithPreferances()));
        System.out.println();

        System.out.println("Hospitals with their capacity: ");
        hospitalSet.forEach(x -> System.out.println(x.getHospitalWithCapacity()));
        System.out.println();

        System.out.println("Map with all the resident's preferances: ");
        Map<Resident, List<Hospital>> residentPreferences =
                residentList.stream()
                        .collect(Collectors.toMap(x -> x, x -> x.getPreferences()));
        System.out.println(residentPreferences);
        System.out.println();

        System.out.println("Concurent map with all the resident's preferances: ");
        Map<Hospital, List<Resident>> hospitalPreferences =
                hospitalSet.stream()
                        .collect(Collectors.toConcurrentMap(x -> x, x->x.getPreferences()));
        System.out.println(hospitalPreferences);
        System.out.println();

        System.out.println("Residents that find acceptable h0 or h2: ");
        residentList.stream()
                .filter(x -> x.getPreferences().stream()
                                .anyMatch(y -> y.getName() == "H0"))
                .filter(x -> x.getPreferences().stream()
                                .anyMatch(y -> y.getName() == "H2"))
                .forEach(x -> System.out.println(x.getRsidentWithPreferances()));
        System.out.println();

        System.out.println("Hospitals that have R0 as top preferance: ");
        hospitalSet.stream()
                .filter(x -> x.getPreferences().get(0).getName() == "R0")
                .forEach(x -> System.out.println(x));
        System.out.println();
    }
}
