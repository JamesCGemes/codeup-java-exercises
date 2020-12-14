import java.util.Random;

public class ServerNameGenerator {

    public static String[] adj = {"supreme", "vacuous", "incompetent", "flashy","wry", "huge", "short", "adhesive","hallowed","brawny"};
    public static String[] noun = {"twist","mark","kick","tail","monkey","eggs","pocket","rake","mass","rings"};

    public static void main(String[] args) {

        System.out.println("Here is your server name; ");
        System.out.println(getWord(adj) +" "+ getWord(noun));

    }
        public static String getWord(String[] word){
            Random random = new Random();
            int randomIndex = random.nextInt(word.length);
            return word[randomIndex];
        }



}
