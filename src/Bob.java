import java.util.Scanner;

public class Bob {
    public static void main(String[] args){

//        Bob answers 'Sure.' if you ask him a question. (the input ends with a question mark)
//        He answers 'Whoa, chill out!' if you yell at him. (the input ends with an exclamation mark)
//        He says 'Fine. Be that way!' if you address him without actually saying anything. (empty input)
//        He answers 'Whatever.' to anything else.
            Scanner sc = new Scanner(System.in);

            String sure = "Sure";
            String whoa = "Whoa, chill out";
            String fine = "Fine. Be that way";
            String whatever = "Whatever";
            int continueRunning = 1;
//            String askAgain = "y";
//            String stopAsking = "n";

            while(continueRunning != 0) {
            System.out.println("Say something to Bob!");
            String statement = sc.next();

                if (statement.endsWith("?")) {
                    System.out.printf("%s%n", sure);
                } else if (statement.endsWith("!")) {
                    System.out.printf("%s%n", whoa);
                } else if (statement.endsWith(" ")) {
                    System.out.printf("%s%n", fine);
                } else {
                    System.out.printf("%s%n", whatever);
                }
                sc.nextLine();
                System.out.println("would you like to say something else to Bob? Enter 1 =y 0 = n");
                continueRunning = sc.nextInt();

            }
            System.exit(0);
//            if answer  is y then






    }
}
