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
            String askAgain = "y";
            String stopAsking = "n";

            System.out.println("Say something to Bob!");
            String statement = sc.next();

            if(statement.endsWith("?")){
                System.out.printf("%s",sure);
            }else if(statement.endsWith("!")){
            System.out.printf("%s", whoa);
            }else if(statement.endsWith(" ")){
                System.out.printf("%s",fine);
            }else{
                System.out.printf("%s",whatever);
            }

            System.out.println("would you like to say something else to Bob? Enter y/n");





    }
}
