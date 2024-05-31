package Recursion;
import java.util.*;
public class CheckAB {
    
    static boolean check(String str){
        if(str.length() == 0){
            return true; 
        }
        if(str.charAt(0) == 'a'){
            if(str.substring(1).length() > 1 && str.substring(1, 3).equals("bb")){
                return check(str.substring(3));
            }
            else{
                return check(str.substring(1));
            } 
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter AB string: ");
        String str = scn.nextLine();
        System.out.println(check(str));
    }
}