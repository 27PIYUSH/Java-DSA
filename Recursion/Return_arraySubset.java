package Recursion;

import java.util.*;

public class Return_arraySubset {
    
    public static int[] takeInput(){
        Scanner scn = new Scanner(System.in);
        System.out.print("enter the no of elements: ");
        int n = scn.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the elements: ");
        for(int i = 0 ; i<n ; i++){
            arr[i] = scn.nextInt();
        }
        return arr;
    }

    public static int[][] subsethelper(int[] arr,int startindex){
        if(startindex == arr.length){
            int[][] ans = new int[1][0]; 
            return ans;
        }
        
        int[][] smalloutput = subsethelper(arr, startindex+1);
        int[][] ans = new int[2*smalloutput.length][];

        int k = 0;
        for(int i = 0 ; i<smalloutput.length ; i++){
            // used to create jagged array depending upon the size of each row
            ans[k] = new int[smalloutput[i].length];

            // copy the elements of smalleroutput into the ans array
            for(int j = 0 ; j<smalloutput[i].length ; j++){
                ans[k][j] = smalloutput[i][j];
            }
            k++;
        }
        
        // add the element at 0th index on which we are working
        for(int i = 0 ; i<smalloutput.length ; i++){
            ans[k] = new int[smalloutput[i].length+1];
            ans[k][0] = arr[startindex];
            for(int j = 1 ; j<=smalloutput[i].length ; j++){
                ans[k][j] = smalloutput[i][j-1];
            }
            k++;
        }
        return ans;
    }

    static int[][] subsets(int[] ans){
        return subsethelper(ans, 0);
    }

    public static void main(String[] args) {
        int[] arr = takeInput();
        int[][] ans = subsets(arr);
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[i].length; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }
}
