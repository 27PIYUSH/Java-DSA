package Strings;
import java.util.Scanner;

public class Palindrome {

    public static boolean checkPalindrome(String str){
        int i = 0 , j = str.length()-1;
        while(i!=j){
            if (str.charAt(i) != str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    String str = scn.nextLine();
    if(checkPalindrome(str)){
        System.out.println("Palindrome");
    }
    else{
        System.out.println("Not a Palindrome");
    }
    }
    
}
