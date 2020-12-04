import java.util.Scanner;

public class Bob {
    public static void main(String[] args){

            Scanner sc = new Scanner(System.in);

            String sure = "Sure";
            String whoa = "Whoa, chill out";
            String fine = "Fine. Be that way";
            String whatever = "Whatever";
            int continueRunning = 1;


            while(continueRunning != 0) {
            System.out.println("Say something to Bob!");
            String statement = sc.next();

                if (statement.endsWith("?")) {
                    System.out.printf("%s%n", sure);
                } else if (statement.endsWith("!")) {
                    System.out.printf("%s%n", whoa);
                } else if (statement.isEmpty()) {
                    System.out.printf("%s%n", fine);
                } else {
                    System.out.printf("%s%n", whatever);
                }
                sc.nextLine();
                System.out.println("would you like to say something else to Bob? Enter 1 =yes 0 = no");
                continueRunning = sc.nextInt();

            }
            System.exit(0);
    }
}







