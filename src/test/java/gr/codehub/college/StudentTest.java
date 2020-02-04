package gr.codehub.college;

import gr.codehub.college501.AchievedMark;
import gr.codehub.college501.MarkModule;
import gr.codehub.college501.Student;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {


    private Student student;
    private MarkModule markModule1;
    private MarkModule markModule2;
    private AchievedMark achievedMark1;
    private AchievedMark achievedMark2;

    @BeforeEach
    public void setUP(){

        student = new Student();
        achievedMark1 =  new AchievedMark(new Date(),6);
        achievedMark2 = new AchievedMark(new Date(),8);
        markModule1 = new MarkModule();
        markModule2 = new MarkModule();
    }

    @Test
    public void getAverageMarkTest(){
        markModule1.addMark(achievedMark1);
        markModule2.addMark(achievedMark2);
        student.addMarkModule(markModule1);
        student.addMarkModule(markModule2);
        assertEquals(7, student.getAverageMark());
    }


}