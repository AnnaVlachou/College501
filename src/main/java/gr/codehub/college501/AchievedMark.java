package gr.codehub.college501;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


@Data
@NoArgsConstructor
@AllArgsConstructor

public class AchievedMark {
    private Date date;
    private int mark;


}
