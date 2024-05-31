package Strings;
import java.util.Scanner;

public class Highest_ocurring_char {

    public static void Highest_ocurring_char(String str){
        
        int[] frequency = new int[256];
        char ans = ' ';

        for (int i = 0 ; i<str.length() ; i++){
            char ch = str.charAt(i);
            ++frequency[ch];
        }
        int max = 0 ;
        for (int i = 0 ; i<frequency.length ; i++){
            if (frequency[i]>max){
                max = frequency[i];
                ans = (char)i;
            }
        }
        System.out.println(ans);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        Highest_ocurring_char(str);
    }
}
