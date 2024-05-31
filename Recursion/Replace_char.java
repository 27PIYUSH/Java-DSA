package Recursion;

import java.util.Scanner;

public class Replace_char {

    public static String replaceChar(String str , char ch , char x){
        String ans = "";
        if(str.length() == 0){
            return ans;
        }
        else if (str.charAt(0) == ch){
            ans += x;
        }
        else{
            ans += str.charAt(0);
        }
        String smallAns = replaceChar(str.substring(1), ch, x);
        return ans+smallAns;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = scn.nextLine();
        System.out.print("enter the character to be replaced: ");
        char ch = scn.next().charAt(0);
        System.out.print("enter the new character: ");
        char x = scn.next().charAt(0);
        System.out.println("New string: "+ replaceChar(str, ch ,x));
    }

}

