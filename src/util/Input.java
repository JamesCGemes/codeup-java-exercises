package util;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Input {

    private Scanner scanner;

    public Input(){
        this.scanner = new Scanner(System.in);
    }
//************************************
    public String getString(){
        System.out.println("Type something");
        return this.scanner.nextLine();
    }

    public boolean yesNo(){
        System.out.println("Type yes or no");
        if(this.scanner.nextLine().toLowerCase().equals("yes") || this.scanner.nextLine().toLowerCase().equals("y")){
            return true;
        } else return false;
    }
//************************************

public int getInt(int min, int max){
    int userNum = getInt();
    if(userNum < min || userNum > max){
        System.out.println("try again");
        getInt();
    }else if(userNum > min || userNum < max){
        System.out.println("Good guess");
    }
        return
}


    public int getInt(){
        System.out.println("Pick a number");
        return this.scanner.nextInt();
    }
////************************************
//    public double getDouble(double min, double max){
//
//    }
//
//    public double getDouble(){
//
//    }
}
