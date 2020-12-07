import java.util.Random;
import java.util.Scanner;


public class MethodsExercises {

       static Scanner sc = new Scanner(System.in);

    public static void addition(int num1, int num2){
        System.out.println(num1 + num2);
    }

    public static void subtraction(int num1, int num2){
        System.out.println(num1 - num2);
    }

    public static void multiply(int num1, int num2){
        System.out.println(num1 * num2);
    }

    public static void division(int num1, int num2){
        System.out.println(num1 / num2);
    }

    public static void modulus(int num1, int num2){
       System.out.println(num1 % num2);
    }

    public static int getInteger(int min, int max){
        int userNum;
        System.out.println();
        System.out.println("Pick a number between 1 and 10");
        userNum = sc.nextInt();
        if(userNum > min  || userNum < max){
            System.out.println("The number you picked is with in the range");
        }else {
            getInteger(1,10);
        }
        return userNum;
    }
//Method for displaying factorial based on user input.
    public static void getFactorial(int pickedNum){
        int userNum = getInteger(1,10);
        long factorialNum = 1;
            for (int counter = 1; counter <= userNum; counter++) {
                factorialNum *= counter;
            }
        System.out.printf("The factorial of %d! = %d ",userNum,factorialNum);

    }

    public static void diceGame(int inputOne,int inputTwo){
        Random rand = new Random();
        int totalNumOfSides = inputOne + inputTwo;
        int diceRollNum = rand.nextInt(totalNumOfSides);
        System.out.printf("You rolled a %d%n",diceRollNum);
    }


    public static void main(String[] args) {

        addition(20,40);
        subtraction(40,20);
        multiply(10,10);
        division(60,30);
        modulus(30,12);

//        check if user input is between 1 and 10.

//        getInteger(1,10);

//
//         3. get number and show factorial
        System.out.println("Please pick a number between 1 and 10");
        int userNum = sc.nextInt();
        getFactorial(userNum);


//**************************************************//
//    prompt user for number of sides per die.
//    capture the two inputs and store in variables
        System.out.println("Please enter the number of sides for first die");
        int sidesOne = sc.nextInt();
        System.out.println("Please enter the number of sides for second die");
        int sidesTwo = sc.nextInt();
//    prompt user to roll dice.
        System.out.println("would you like to roll the dice? yes or no.");
        do{
            diceGame(sidesOne,sidesTwo);
        }while(sc.next().equals("yes"));











    }
}