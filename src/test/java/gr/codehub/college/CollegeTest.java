package gr.codehub.college;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class CollegeTest {
    private College college;
    private Student student;
    private Course course;
    private MarkModule markModule1;
    private MarkModule markModule2;
    private AchievedMark achievedMark1;
    private AchievedMark achievedMark2;




    @BeforeEach
    public void setUp(){
        student = new Student();
        college = new College();
        course = new Course();
        achievedMark1 =  new AchievedMark(new Date(),6);
        achievedMark2 = new AchievedMark(new Date(),8);
        markModule1 = new MarkModule();
        markModule2 = new MarkModule();

    }
    @Test
    public void calculateStudentCountTest(){
        college.addStudents(student);

        assertEquals(1, college.calculateStudentCount());
    }



}