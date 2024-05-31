package Recursion;
import java.util.*;

public class Replace_pi {

    public static String replace(String str){
        String ans="";
        if(str.length() <= 1){
            return str;
        }
        String small = replace(str.substring(1));
        if(str.charAt(0) == 'p' && small.charAt(0) == 'i'){
            ans = "3.14" + small.substring(1);
        }
        else{
            ans = str.charAt(0) + small;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = scn.nextLine();
        System.out.println("New string: "+ replace(str));
    }
    
}
