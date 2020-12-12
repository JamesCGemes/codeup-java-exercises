import java.util.*;


public class ArraysExercises {
    public static void main(String[] args){


        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));

        Person[] people = new Person[3];

        people[0] = new Person("James");
        people[1] = new Person("Cassie");
        people[2] = new Person("Jacob");

        for(Person personsName : people){
            System.out.println("Person name is " + personsName.getName());
        }




    }
}
