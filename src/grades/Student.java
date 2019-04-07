package grades;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private List<Integer> grades;

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public String getName(){
        return name;
    }
    public void addGrade(int grade){
        grades.add(grade);
    }

    public double getGradeAverage(){
        double total = 0;
        for(int i = 1; i <this.grades.size(); i++){
            total += this.grades.get(i);
        }
        return total / grades.size();

    }


    public static void main(String[] args) {
        Student student1 = new Student("Jambi");

        System.out.println(student1);
        System.out.println(student1.grades);
        student1.addGrade(0);
        student1.addGrade(100);
        System.out.println(student1.getGradeAverage());
        System.out.println(student1.grades);




    }





}//end of class