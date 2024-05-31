package Recursion;
import  java.util.*;

public class Subsequences {
    
    public static String[] findsubsequnces(String str){
        if(str.length() == 0){
            String[] ans = {""};
            return ans;
        }
        // find all subsequences of the word starting from the 1st index   Eg---> xyz  find all subsequences of yz ---> z y yz
        String smallans[] = findsubsequnces(str.substring(1));
        String ans[] = new String[2*smallans.length];
        
        // copy the subsequneces stored in the samllans ---> z y yz
        int k = 0;
        for(int i = 0 ; i<smallans.length ; i++){
            ans[k] = smallans[i];
            k++;
        } 

        // append the 1st character in front of the smallans and create the subsequences ---> z y yz x xz xy xyz 
        for(int i = 0 ; i<smallans.length ; i++){
            // ans[i + smallans.length] = str.charAt(0) + smallans[i];
            ans[k] = str.charAt(0) + smallans[i];  //x xz xy xyz
            k++;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = scn.nextLine();
        String[] ans = findsubsequnces(str);
        for (String ele : ans) {
            System.out.print(ele +" ");
        }
    }
}
