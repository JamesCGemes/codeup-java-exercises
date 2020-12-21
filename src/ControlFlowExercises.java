import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
//     1.a Outputs 5-15 using a while loop
//        int i = 5;
//
//        while (i <= 15) {
//            System.out.printf("%d ",i);
//            i++;
//        }


//      1.b will count by 2's up to 100.
//        int a = 0;
//        do {
//            System.out.println(a);
//            a = a + 2;
//        } while (a <= 100);


//          counts backwards from 100 by 5's
//        int num = 100;
//        do{
//            System.out.println(num);
//            num = num - 5;
//        }while (num >= -10);

//        will output 2 squared up to 1,000,000.
//            long toBeSquared = 2L;
//            do{
//                System.out.println(toBeSquared);
//                toBeSquared *= toBeSquared;
//            }while(toBeSquared <= 1000000);

//        Refactor previous exercises to use a for loop.






//        Using for loop to refactor 1.a and 1.b


//        for(int i = 5; i <=15; i++){
//            System.out.printf("%d ",i);
//        }

//        for(int a = 0; a <= 100;){
//            System.out.println(a);
//            a += 2;
//        }
//        for(int num = 100; num >= -10;){
//            System.out.println(num);
//            num -= 5;
//        }
//        for(long num = 2L; num <= 1000000;){
//            System.out.println(num);
//            num *= num;
//
//        }

// 2. FizzBuzz
//        for(int i = 1; i <= 100 ; i++){
//            if(((i % 3) == 0) && ((i % 5) == 0)){
//                System.out.println("FizzBuzz");
//            }else if(i % 3 == 0){
//                System.out.println("Fizz");
//            }else if(i % 5 == 0){
//                System.out.println("Buzz");
//            }else{
//                System.out.println(i);
//            }
//        }

//        3.Display table of powers


        Scanner sc = new Scanner(System.in);
        boolean keepGoing = true;

//        do {
//            System.out.print("What number would you like to go up to? ");
//            int userNum = sc.nextInt();
//            System.out.println();
//            System.out.println("Here is your table");
//            System.out.println();
//            System.out.println("Number | Squared | Cubed");
//            System.out.println("------ | ------- | -----");
//            for (int i = 1; i <= userNum; i += 1){
//                System.out.format("%-7d", i);
//                System.out.print("|");
//                System.out.format(" %d-8", i * i);
//                System.out.print("|");
//                System.out.format(" %d-9", i * i * i);
//                System.out.println();
//            }
//            System.out.print("Would you like to pick another number? y/n");
//            String userResponse = sc.next();
//                if (!userResponse.equals("y")){
//                    keepGoing = false;
//                }
//        }while (keepGoing);



        do{
            System.out.println("Please enter a numerical grade between 0 and 100");
            int userGrade = sc.nextInt();

            if(userGrade <= 59){
                System.out.println("You got an F");
            }
            if(userGrade <= 66 && userGrade >= 60){
                System.out.println("You got a D");
            }
            if(userGrade <= 79 && userGrade >= 67){
                System.out.println("You got a  C");
            }
            if(userGrade <= 87 && userGrade >= 80){
                System.out.println("You got a B");
            }
            if (userGrade >= 88){
                System.out.println("You got an A");
            }
            System.out.println("Would you like to enter another grade? y/n");
            String userResponse = sc.next();
            if (!userResponse.equals("y")){
                keepGoing = false;
            }

        }while (keepGoing);






    }
}

