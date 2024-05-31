package Recursion;
import java.util.*;

public class StringToInt {

    static int ConvertStringToInteger(String str){
        if(str.length()==1){
            return str.charAt(0) - '0';  //value of '0' = 48
        }
        int smalloutput = ConvertStringToInteger(str.substring(0, str.length()-1));
        int lastdigit = str.charAt(str.length()-1) - '0' ;
        return smalloutput*10 + lastdigit; 
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = scn.nextLine();
        System.out.println(ConvertStringToInteger(str));
    }
}
