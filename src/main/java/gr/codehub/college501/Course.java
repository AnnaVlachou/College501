package gr.codehub.college501;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Course {
    private String name;
    private String location;
    private Cohort cohort;


}
