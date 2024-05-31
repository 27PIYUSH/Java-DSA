package Recursion;
import java.util.*;
public class PrintAllCodes {

    static char getChar(int n){
        return (char)(96+n);
    }
    
    static void printCode(String str , String outputSoFar){
        if(str.length() == 0){
            System.out.println(outputSoFar);
            return;
        }

        int firstdigit = str.charAt(0) - '0';
        printCode(str.substring(1), outputSoFar + getChar(firstdigit));
        int firstTwoDigits = 0;
        if(str.length()>=2){
            firstTwoDigits = (str.charAt(0) - '0')*10 + (str.charAt(1) - '0');
            if(firstTwoDigits >= 10 && firstTwoDigits <= 26){
                printCode(str.substring(2), outputSoFar + getChar(firstTwoDigits));
            }
        }
    }

    static void printAllPossibleCodes(String str){
        printCode(str, "");
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = scn.nextLine();
        printAllPossibleCodes(str);
    }
}
