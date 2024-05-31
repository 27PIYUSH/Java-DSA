package Strings;
import java.util.Scanner;
public class Remove_consecutive_duplicates {

    public static String removeConsecutiveDuplicates(String str){
        String ans = "";
        for(int i = 0; i < str.length(); i++){
            if(ans.isEmpty() || str.charAt(i) != ans.charAt(ans.length()-1)) {
                ans += str.charAt(i);
            }
        }
        return ans;
    }
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        System.out.println(removeConsecutiveDuplicates(str));
    }
}

