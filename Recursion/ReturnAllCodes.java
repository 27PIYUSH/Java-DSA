package Recursion;

import java.util.Arrays;
import java.util.Scanner;

public class ReturnAllCodes {
    
    static char getChar(int n){
        return (char)(96+n);
    }

    static String[] getcode(String str){
        if(str.length()==0){
            String[] output = {""};
            return output;
        }
        int firstdigit = str.charAt(0)-'0';
        String[] smalloutput1 = getcode(str.substring(1));
        String[] smalloutput2 = new String[0];

        int firstTwoDigits = 0;
        if(str.length()>=2){
            firstTwoDigits = (str.charAt(0) - '0')*10 + (str.charAt(1) - '0');
            if(firstTwoDigits>10 && firstTwoDigits<=26){
                smalloutput2 = getcode(str.substring(2));
            }
        }

        String[] output = new String[smalloutput1.length+smalloutput2.length];
        int k = 0 ; 
        for (String i : smalloutput1) {
            char firstDigitChar = getChar(firstdigit);
            output[k] = firstDigitChar + i ;
            k++;
        }

        for (String i : smalloutput2) {
            char firstTwoDigitChar = getChar(firstTwoDigits);
            output[k] = firstTwoDigitChar + i ;
            k++;
        }
        return output;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = scn.next();
        String[] arr = getcode(str);
        for (String ele : arr) {
            System.out.println(ele);
        }
    }
}