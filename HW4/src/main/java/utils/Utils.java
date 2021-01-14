package utils;

import java.util.Scanner;

public class Utils{
    public static StringBuilder stringBuilder;
    public String string;
    public Scanner scanner;

    public Utils(){
        this.string = "";
    }

    public String Scanner(String string){
        scanner = new Scanner(System.in);
        string = scanner.nextLine();
        return string;
    }

    public static StringBuilder SB(String string){
        return stringBuilder;
    }
}
