package Recursion;

import java.util.Scanner;

public class Print_subsequences {
    // function to store our outupt
    static void printSubsequences(String str , String outputSoFar){
        if(str.length()==0){
            System.out.println(outputSoFar);
            return;
        }
        // when we choose not to include the first character
        printSubsequences(str.substring(1),outputSoFar);
        // when we include the first character
        printSubsequences(str.substring(1), outputSoFar + str.charAt(0));

    }

    static void printSubsequences(String str){
        printSubsequences(str, "");
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = scn.nextLine();
        printSubsequences(str);
    }

}
