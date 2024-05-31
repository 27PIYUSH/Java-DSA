package Recursion;
import java.util.*;

public class Remove_duplicates {

    public static String removeDuplicates(String str){
        if(str.length() <= 1){
            return str;
        }
        else if(str.charAt(0) == str.charAt(1)){
            // return the substring which we get from recursion after removing the duplicates 
            // a + abcd --> abcd
            return removeDuplicates(str.substring(1));
        }
        else{
            // b + abcd --> babcd
            return str.charAt(0) + removeDuplicates(str.substring(1));
        }
    }

    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        System.out.print("enter string: ");
        String str = scn.nextLine();
        System.out.println("New string: " + removeDuplicates(str)); 
    }
    
}
