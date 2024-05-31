package Recursion;

import java.util.Scanner;

public class Remove_X {

    public static String RemoveX(String str){
        if(str.length() == 0){
            return "";
        }
        String small = RemoveX(str.substring(1));
        if(str.charAt(0) == 'x'){
            return small;
        }
        else{
            return str.charAt(0) + small;
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = scn.nextLine();
        System.out.println("New string: "+ RemoveX(str));
    }
    
}
