package Strings;
import java.util.Scanner;

public class substrings {
    //randomly
    static void random_substring(String str){
        for(int i = 0 ; i<str.length(); i++){
            for(int j = i; j<str.length(); j++){
                System.out.println(str.substring(i,j+1));
            }
        }
    }

    static void len_substring(String str){
        for(int len = 1 ; len<=str.length(); len++){
            for(int start = 0; start<=str.length()-len; start++){
                int end = start + len - 1;
                System.out.println(str.substring(start,end+1));
            }
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        random_substring(str);
        len_substring(str);
    }

}