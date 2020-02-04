package gr.codehub.college501;

import lombok.Data;
import org.json.JSONArray;

import java.beans.XMLEncoder;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

@Data
public class College {
    private List<Student> students;


    public College() {

        students = new ArrayList<>();
    }

    public void addStudents(Student student) {
        students.add(student);

    }


    public int calculateStudentCount() {

        return students.size();
    }

    public double calculateStudentAvgMarks() {
        return students
                .stream()
                .mapToDouble(Student::getAverageMark)
                .average()
                .getAsDouble();
    }


    public void saveStudents(String filename)
            throws FileNotFoundException {

        PrintWriter pw = new PrintWriter(new File(filename));

        for (Student s : students)
            pw.println(s.getId() + ";" + s.getCourse() + ";"
                    + s.getAverageMark());

        pw.close();
    }


    public String getAsJson() {

        JSONArray jsArray = new JSONArray(students);

        return jsArray.toString();
    }


    public boolean saveJsonToFile(String filename) {
        try (PrintWriter pw = new PrintWriter(
                new File(filename))) {

            pw.println(getAsJson());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return true;
    }


    public void saveAsXML(String filename) {
        XMLEncoder encoder = null;
        try {
            encoder = new XMLEncoder(new BufferedOutputStream(new FileOutputStream(filename)));
        } catch (FileNotFoundException fileNotFound) {
            System.out.println("ERROR: While Creating or Opening the File students.xml");
        }
        encoder.writeObject(students);
        encoder.close();
    }


}
