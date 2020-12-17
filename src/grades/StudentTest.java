package grades;

public class StudentTest {


    public static void main(String[] args) {

        Student james = new Student("James");
        james.addGrade(80);
        james.addGrade(85);
        james.addGrade(83);
        james.addGrade(95);
        james.addGrade(50);

        System.out.println(james.getGradeAverage());

    }
}
