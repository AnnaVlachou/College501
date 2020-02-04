package gr.codehub.college501;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;


@Data
public class MarkModule {
    private Module module;
    private List<AchievedMark> achievedMarks;

    public MarkModule() {
        achievedMarks = new ArrayList<>();

    }


    public void addMark(AchievedMark achievedMark) {
        achievedMarks.add(achievedMark);

    }

    public boolean hasPassed() {
        return achievedMarks
                .stream()
                .mapToInt(AchievedMark::getMark)
                .max()
                .getAsInt() > 5;
    }


    public int getMark() {
        return achievedMarks
                .stream()
                .filter(p -> p.getMark() > 5)
                .mapToInt(AchievedMark::getMark)
                .max()
                .getAsInt();


    }

}
