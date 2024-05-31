package Recursion;

import java.util.Scanner;

public class ReturnPermutations {
    
    static String[] permutationOfString(String str){
        if(str.length()==0){
            String[] output = {""};
            return output;
        }
        String[] smallerOutput = permutationOfString(str.substring(1));
        String[] output = new String[str.length() * smallerOutput.length];
        
        int k = 0;
        for (int i = 0; i < smallerOutput.length; i++) {
            String currentString = smallerOutput[i];
            for(int j = 0; j <= currentString.length(); j++){
                output[k] = currentString.substring(0, j) + str.charAt(0) + currentString.substring(j);
                k++;
            }
        }
        return output;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = scn.nextLine();
        String[] ans = permutationOfString(str);
        for (String ele : ans) {
            System.out.println(ele);
        }
    }

}
