package grades;

import util.Input;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GradesApplication {
    public static Map<String, Student> students = new HashMap<>();
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
        Input input = new Input();
        init();
        welcome();
        boolean keepGoing = true;

        do{
            System.out.println();
            System.out.println("What student would you like to view?");
            String studentChoice = input.getString();
            System.out.println(studentChoice);
            if(students.containsKey(studentChoice)){
            outputStudentRecord(studentChoice);
            }else {
                System.out.println("Error.  No student found with the github username of " + studentChoice);
            }
            System.out.println("Would you like to see another student?");
            keepGoing = input.yesNo();
            System.out.println(keepGoing);
        }while(keepGoing);





//        Map<String, Student> students = new HashMap<>();
//        Student s1 = new Student("James");
//        Student s2 = new Student("Jeremy");
//        Student s3 = new Student("Bethany");
//        Student s4 = new Student("Adrien");
//
//        s1.addGrade(45);
//        s1.addGrade(95);
//        s1.addGrade(85);
//
//        s2.addGrade(85);
//        s2.addGrade(96);
//        s2.addGrade(87);
//
//        s3.addGrade(98);
//        s3.addGrade(95);
//        s3.addGrade(90);
//
//        s4.addGrade(45);
//        s4.addGrade(65);
//        s4.addGrade(75);
//
//        students.put("jlampkins", s1);
//        students.put("Jergon", s2);
//        students.put("bbramy", s3);
//        students.put("krazyAdrien", s4);

        //keyset will give the key
        //value will give the value
//        System.out.println("Welcome!");
//        System.out.println("Here are the github usernames of our students:");
//        for (int i = 0; i < students.size(); i++) {
//            System.out.println(students.keySet());
//
//
//            System.out.println(s1.getName());
//            System.out.println(s2.getName());
//            System.out.println(s3.getName());
//            System.out.println(s4.getName());
//            Scanner readUserName = new Scanner(System.in);
//            System.out.println("Which username would you like to look up?");
//            String inputUserName = readUserName.nextLine();
//            if (students.containsKey(inputUserName)) {
//                System.out.println(students.get(inputUserName).getGradeAverage());
//
//            }
//        }


    }//end of main
private static void init() {
//    Map<String, Student> students = new HashMap<>();
    Student s1 = new Student("James");
    Student s2 = new Student("Jeremy");
    Student s3 = new Student("Bethany");
    Student s4 = new Student("Adrien");

    s1.addGrade(45);
    s1.addGrade(95);
    s1.addGrade(85);

    s2.addGrade(85);
    s2.addGrade(96);
    s2.addGrade(87);

    s3.addGrade(98);
    s3.addGrade(95);
    s3.addGrade(90);

    s4.addGrade(45);
    s4.addGrade(65);
    s4.addGrade(75);

    students.put("jlampkins", s1);
    students.put("Jergon", s2);
    students.put("bbramy", s3);
    students.put("krazyAdrien", s4);
}
private static void outputStudentRecord(String key){
    System.out.println("Name: " + students.get(key).getName());
    System.out.println("GitHub Username: " + key);
//    System.out.println("Current average: " + students.get(key).getGradeAverage());
    System.out.printf("Current average: %.2f\n", students.get(key).getGradeAverage());
}
    private static void welcome() {
        System.out.println("Welcome!");
        String userNames = "|";
        for (String key : students.keySet())
            userNames += " " + key + " |";
        System.out.println("Here are the github usernames" + userNames);
    }
}//end of class