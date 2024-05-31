package Recursion;

import java.util.Scanner;

public class Remove_char {

    public static String Remove_char(String str , char ch){
        String ans = ""; 
        if(str.length() == 0){
            return ans;
        }
        else if(str.charAt(0) != ch){
            ans += str.charAt(0);
        }
        String smallAns = Remove_char(str.substring(1), ch);
        return ans + smallAns;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = scn.nextLine();
        System.out.print("enter the character to be removed: ");
        char ch = scn.next().charAt(0);
        System.out.println("New string: "+ Remove_char(str, ch));
    }
    
}
