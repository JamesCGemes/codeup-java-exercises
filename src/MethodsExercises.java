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
    public static int getFactorial(int pickedNum){
//        make counter = to 1
        long factorialNum;
//        increment the counter by 1 while<= pickedNumber
//        multiply the pickedNum by the counter number
//        Display "%d! = %d x",pickedNum, counter
        int counter = 1;
        if(counter <= pickedNum, counter + 1 ){

        }
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
        System.out.println("Please pick a number between 1 and 10");
        int userNum = sc.nextInt();
        getFactorial(userNum);





    }
}