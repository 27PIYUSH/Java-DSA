package Strings;

import java.util.Scanner;

public class Check_permutation {
    
    public static boolean Check_permutation(String str1 ,String str2){
        if(str1.length() != str2.length()){
            return false;
        }
        int[] frequency = new int[256];

        for(int i = 0 ; i<str1.length(); i++){
            char ch = str1.charAt(i);
            ++frequency[ch];
        }

        for(int i = 0 ; i<str2.length(); i++){
            char ch = str2.charAt(i);
            -- frequency[ch];
        }

        for(int i = 0 ; i<256; i++){
           if(frequency[i] != 0){
            return false;
           }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str1 = scn.nextLine();
        String str2 = scn.nextLine();
        System.out.println(Check_permutation(str1, str2));
    }
}