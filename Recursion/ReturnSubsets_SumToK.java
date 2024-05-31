package Recursion;

import java.util.*;

public class ReturnSubsets_SumToK {

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

    static int[][] SubsetsSumToKHelper(int[] arr , int k,int startindex){
        if(startindex == arr.length){
            if(k==0){
                int[][] output = new int[1][0];
                return output;
            }
            else{
                int[][] output = new int[0][0];
                return output;
            }
        }
        int[][] smallans1 = SubsetsSumToKHelper(arr, k, startindex+1); // not including startindex
        int[][] smallans2 = SubsetsSumToKHelper(arr, k-arr[startindex], startindex+1); // including startindex
        int[][] output = new int[smallans1.length + smallans2.length][];

        int index = 0;
        for(int i=0; i<smallans1.length; i++){
            output[index] = smallans1[i];
            index++;
        }
        for(int i = 0 ; i<smallans2.length; i++){
            output[index] = new int[smallans2[i].length+1];
            output[index][0] = arr[startindex];
            for(int j = 0; j<smallans2[i].length;j++){
                output[index][j+1] = smallans2[i][j];
            }
            index++;
        }
        return output;
    }
     
    static int[][] subsetsSumk(int[] arr,int k){
        return SubsetsSumToKHelper(arr, k, 0);
    }

    public static void main(String[] args) {
        int[] arr = takeInput();
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the sun to be searched: ");
        int k = scn.nextInt();
        int[][] ans = subsetsSumk(arr, k);
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[i].length; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }
}
