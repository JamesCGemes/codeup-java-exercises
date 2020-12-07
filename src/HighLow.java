import java.util.Random;
import java.util.Scanner;

public class HighLow {

       static Scanner sc = new Scanner(System.in);
       static Random random = new Random();
//    Create random number between 1 and 100.
    public static int makeRandomNum(){
        int max = 100;
        int min = 1;
        return random.nextInt(max - min) + min;
    }



//      Determine if number is within range
    public static boolean determineRange(int inputNum){
        if(inputNum > 1 && inputNum < 100){
            return true;
        }else{
            return false;
        }

    }

//**************************************************************//
    public static void main(String[] args) {
        System.out.println("Guess a number between 1 an 100");
        int number = sc.nextInt();
        if(determineRange(number)== true){
            if(number == makeRandomNum()){ System.out.println("Good guess!!");}

            if(number > makeRandomNum()){ System.out.println("Sorry to high.");}

            if(number < makeRandomNum()){ System.out.println("Sorry to low."); }
        }else System.out.println("Please pick a number between 1 and 100");

// Determine if user input is between 1 and 100.




    }
}
