package Strings;

import java.util.Scanner;

public class Reverse {

    private static Object n;
    public static String reverse(String str){
        String rev = "";
        for(int i = str.length()-1 ; i>=0 ; i--){
            rev+=str.charAt(i);
        }
        return rev;
    }
    public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    String str = scn.nextLine();
    String reversed = reverse(str);
    System.out.println(reversed);
    }
}
