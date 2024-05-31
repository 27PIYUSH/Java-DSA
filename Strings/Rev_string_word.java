package Strings;
import java.util.Scanner;

public class Rev_string_word {
    
    public static String rev(String str){
        String rev = "";
        for(int i  = str.length()-1; i>=0 ; i--){
            rev+=str.charAt(i);
        }
        return rev;
    }

    public static String Reverse_word(String rev){
        String ans = "";
        int CurrentWordStart = 0;
        int i = 0;
        for ( ; i<rev.length() ; i++){
            if(rev.charAt(i)==' '){
                //reverse current word 
                int CurrentWordEnd = i-1;
                String rev2 = "";
                for(int j = CurrentWordEnd ; j >= CurrentWordStart ; j--){
                    rev2+=rev.charAt(j);
                }

                //add it to final string(ans)
                ans += rev2 + " ";
                CurrentWordStart = i+1;
            }
        }   
        int CurrentWordEnd = i-1;
        String rev2 = "";
        for(int j = CurrentWordEnd ; j >= CurrentWordStart ; j--){
            rev2+=rev.charAt(j);
        }
        ans += rev2;
        return ans;
    }


    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        String str1 = rev(str);
        System.out.println(Reverse_word(str1));
    }
    
}
