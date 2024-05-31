package Strings;
import java.util.Scanner;

public class Reverse_Each_word {

    public static String Reverse_word(String str){
        String ans = "";
        int CurrentWordStart = 0;
        int i = 0;
        for ( ; i<str.length() ; i++){
            if(str.charAt(i)==' '){
                //reverse current word 
                int CurrentWordEnd = i-1;
                String rev = "";
                for(int j = CurrentWordEnd ; j >= CurrentWordStart ; j--){
                    rev+=str.charAt(j);
                }

                //add it to final string(ans)
                ans += rev + " ";
                CurrentWordStart = i+1;
            }
        }   
        int CurrentWordEnd = i-1;
        String rev = "";
        for(int j = CurrentWordEnd ; j >= CurrentWordStart ; j--){
            rev+=str.charAt(j);
        }
        ans += rev;
        return ans;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        System.out.println(Reverse_word(str));
    }
    
}