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
        System.out.println("Type somthing");
        return this.scanner.nextLine();
    }

    public boolean yesNo(){
        System.out.println("Type yes or no");
        if(this.scanner.nextLine().toLowerCase().equals("yes") || this.scanner.nextLine().toLowerCase().equals("y")){
            return true;
        } else return false;
    }
////************************************
//    public int getInt(int min, int max){
//
//    }
//
//    public int getInt(){
//
//    }
////************************************
//    public double getDouble(double min, double max){
//
//    }
//
//    public double getDouble(){
//
//    }
}
