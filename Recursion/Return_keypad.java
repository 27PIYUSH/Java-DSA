package Recursion;
import java.util.*;

public class Return_keypad {

    static String[] options(int num){
        if(num<=1 || num>10){
            String[] output = {""};
            return output;
        }
        if(num==2){
            String[] output = {"a","b","c"};
            return output;
        }
        if(num==3){
            String[] output = {"d","e","f"};
            return output;
        }
        if(num==4){
            String[] output = {"g","h","i"};
            return output;
        }
        if(num==5){
            String[] output = {"j","k","l"};
            return output;
        }
        if(num==6){
            String[] output = {"m","n","o"};
            return output;
        }
        if(num==7){
            String[] output = {"p","q","r","s"};
            return output;
        }
        if(num==8){
            String[] output = {"t","u","v"};
            return output;
        }
        else{
            String[] output = {"w","x","y","z"};
            return output;
        }
    }
     
    static String[] keypad(int num){
        if(num == 0){
            String[] ans = {""};
            return ans;
        }
        String[] smallans = keypad(num/10);
        String[] digitans = options(num%10);
        String[] ans = new String[smallans.length * digitans.length];
        int k =0;
        for(int i=0 ; i<digitans.length; i++){
            for(int j=0 ; j<smallans.length; j++){
                ans[k] = smallans[j] + digitans[i];
                k++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the no. : ");
        int n =scn.nextInt();
        String[] Ans = keypad(n);
        for (String ele : Ans) {
            System.out.println(ele);
        }
    }
    
}
