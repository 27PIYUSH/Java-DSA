package Recursion;
import java.util.*;

public class PairStar {
    
    static String Pair_Star(String str){
        if(str.length() <= 1){
            return str;
        }
        String smallans = Pair_Star(str.substring(1));
        if(str.charAt(0) == smallans.charAt(0)){
            return str.charAt(0)+"*"+smallans;
        }
        else{
            return str.charAt(0) + smallans;
        } 
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = scn.nextLine();
        System.out.println(Pair_Star(str));
    }
}
