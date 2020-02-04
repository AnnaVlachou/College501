package gr.codehub.college501;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

//test2
@Data
@AllArgsConstructor
public class Student {
    private int id;
    private Course course;
    private List<MarkModule> markModules;
    private List<Module> enrolledModules;
    private final int MIN_PASS_MARK = 5;

    public Student(){
        markModules = new ArrayList<>();
        enrolledModules = new ArrayList<>();
    }

    public void addMarkModule(MarkModule markModule){

        markModules.add(markModule);
    }

    public void addEnrollModules(Module enrollm)
    {
        enrolledModules.add(enrollm);

    }


    public double getAverageMark() {
        return markModules
                .stream()
                .mapToInt(MarkModule::getMark)
                .average()
                .getAsDouble();
    }


    public boolean checkIfAllModulesPassed(){

        return  markModules
                .stream()
                .map(MarkModule::hasPassed)
                .allMatch( p->p==true);

    }
}