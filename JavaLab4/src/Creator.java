import javafx.util.Pair;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Creator {
    public static ProblemInstance createDefinedProblemInstance() {
        Hospital h0 = new Hospital("H0", 1);
        Hospital h1 = new Hospital("H1", 2);
        Hospital h2 = new Hospital("H2", 2);
        Resident r0 = new Resident("R0", Stream.of(h0, h1, h2).collect(Collectors.toList()));
        Resident r1 = new Resident("R1", Stream.of(h0, h1, h2).collect(Collectors.toList()));
        Resident r2 = new Resident("R2", Stream.of(h0, h1).collect(Collectors.toList()));
        Resident r3 = new Resident("R3", Stream.of(h0, h2).collect(Collectors.toList()));
        h0.setPreferences(Stream.of(r3, r0, r1, r2).collect(Collectors.toList()));
        h1.setPreferences(Stream.of(r0, r2, r1).collect(Collectors.toList()));
        h2.setPreferences(Stream.of(r0, r1, r3).collect(Collectors.toList()));

        List<Resident> residentList = Stream.of(r0, r1, r2, r3).collect(Collectors.toList());

        Set<Hospital> hospitalSet = new TreeSet<>(Stream.of(h0, h1, h2).collect(Collectors.toSet()));
        return new ProblemInstance(residentList, hospitalSet);
    }
}
