import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args){

//        double pi = 3.14159;
//
//        System.out.printf("The value of pi is approximately %f.%n", pi);
//
        Scanner userInput = new Scanner(System.in);
//
//        System.out.println("Please enter a number");
//
//        int userNum = userInput.nextInt();
//
//        System.out.println("Please enter three words");
//
//        String firstWord = userInput.next();
//        String secondWord = userInput.next();
//        String thirdWord = userInput.next();
//
//        System.out.printf("%s%n%s%n%s%n", firstWord, secondWord,thirdWord);

//        System.out.println("Please enter an sentence.");
//
//        String userSentence = userInput.nextLine();
//
//        System.out.printf("%s", userSentence);

        System.out.println("Please enter the length , width and height of your room");
//        User input for length, width and height.
        String roomLength = userInput.next();
        String roomWidth = userInput.next();
        String roomVolume = userInput.next();

//      Converts the user input string into an integer
        int length = Integer.parseInt(roomLength);
        int width = Integer.parseInt(roomWidth);
        int height = Integer.parseInt(roomVolume);

//      Calculates area, perimeter and volume
        int area = length * width;
        int perimeter = (length * 2) + (width * 2);
        int volume = length * width * height;

        System.out.printf("The area of the room is %d, the perimeter is %d and the volume is %d.", area, perimeter, volume);





    }
}
//    Prompt a user to enter a integer and store that value in an int variable using the nextInt method.Done
//
//        What happens if you input something that is not an integer?
//        Throws an error, it is looking for an integer not a string
//        Prompt a user to enter 3 words, and store each of them in a separate variable. Then, display them back in the console, each on a newline.
//
//        What happens if you enter less than 3 words?
//          It expects three words and will not stop running until it gets them
//        What happens if you enter more than 3 words?
//          It prints the first three words out, the last is not stored or printed.
//        Prompt a user to enter a sentence, then store that sentence in a String variable using the next method. Then, display that sentence back to the user.
//
//        do you capture all the words?
//          No, userInput.next shows one word at a time.
//        Rewrite the above example using the nextLine method.


//    Prompt the user to enter values of length and width of a classroom at Codeup.
//
//        Use the nextLine method to get user input and parse the resulting string to a numeric type.
//
//        Assume that the rooms are perfect rectangles.
//        Assume that the user will enter valid numeric data for length and width.
//        Display the area and perimeter of that classroom.
//
//        The area of a rectangle is equal to the length times the width, and the perimeter of a rectangle is equal to 2 times the length plus 2 times the width.

