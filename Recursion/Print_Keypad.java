package Recursion;
import java.util.*;

public class Print_Keypad {
    
    static String getString(int num){
        if(num<=1 || num>10){
            return "";
        }
        if(num==2){
            return "abc";
        }
        if(num==3){
           return "def";
        }
        if(num==4){
            return "ghi";
        }
        if(num==5){
            return "jkl";
        }
        if(num==6){
            return "mno";
        }
        if(num==7){
            return "pqrs";
        }
        if(num==8){
           return "tuv";
        }
        else{
            return "wxyz";
        }
    }

    static void printkeypad(int num , String outputSoFar){
        if(num==0){
            System.out.println(outputSoFar);
            return;
        }
        int lastDigit = num%10;
        int smallNumber = num/10;
        String options = getString(lastDigit);
        for(int i = 0 ; i<options.length() ; i++){
            printkeypad(smallNumber, options.charAt(i) + outputSoFar);
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the no. : ");
        int n =scn.nextInt();
        printkeypad(n,"");
    }
}
