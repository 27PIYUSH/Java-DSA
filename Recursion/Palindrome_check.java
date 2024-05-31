package Recursion;

import java.util.Scanner;

public class Palindrome_check {

    public static boolean checkPalindrome(String s){
        if(s.length()<=1){
            return true;
        }
        if(s.charAt(0) == s.charAt(s.length()-1)){
            return checkPalindrome(s.substring(1, s.length()-1));
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("enter any string: ");
        String str = scn.nextLine();
        System.out.println(checkPalindrome(str));
    }
    
}
