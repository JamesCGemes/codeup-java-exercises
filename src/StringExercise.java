public class StringExercise {
    public static void main(String[] args){

//       String strOne= "We don't need no education";
//       String strTwo = "We don't need no thought control";
       String song ="We don't need no education We don't need no thought control";

//       System.out.println(strOne);
//       System.out.println(strTwo);
       System.out.printf("%s%n%s%n",song.substring( 0 , 27),song.substring(27,59));

        String strThree = "Check \"this\" out!, \"s inside of \"s!";
        System.out.println(strThree);

        String strFour ="I can do backslashes \\, double backslashes \\\\, and the amazing triple backslash \\\\\\!";
        System.out.println(strFour);

    }
}
