package grades;

import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {

    public static void main(String[] args){

        HashMap<String, Student> students = new HashMap<>();
        Student jim = new Student("jim");
        Student tim = new Student("tim");
        Student ann = new Student("ann");
        Student gertrude = new Student("gertrude");

        jim.addGrade(90);
        jim.addGrade(80);
        jim.addGrade(70);

        tim.addGrade(90);
        tim.addGrade(80);
        tim.addGrade(70);

        ann.addGrade(90);
        ann.addGrade(80);
        ann.addGrade(70);

        gertrude.addGrade(90);
        gertrude.addGrade(80);
        gertrude.addGrade(70);

        // Github user names
        students.put("jimbo", jim);
        students.put("timbo", tim);
        students.put("annbo", ann);
        students.put("gerrdy",gertrude);

// ***********************************************
//    Interface that shows students and allows user to look a specific students.
         Scanner sc = new Scanner(System.in);
        System.out.printf("Welcome %n");
        System.out.printf("Here is a list of the students github usernames: %n");
        System.out.println(students.keySet());


            System.out.println("Who would you like to know more about?");
            String input = sc.next();

            if (students.containsKey(input)){
                System.out.printf("Student name %s , Github username %s and their grade average is %f", students.get(input).getName(), input, students.get(input).getGradeAverage());
            }else {
                System.out.println("Sorry that person does not exist");
            }

    }
}
