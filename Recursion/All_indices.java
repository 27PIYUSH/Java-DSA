package Recursion;

import java.util.Scanner;

public class All_indices {

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

    public static int[] allIndexes(int arr[], int x, int startIndex){
        // If the element at start index is equal to x then (which is the answer of recursion) and then (which came through recursion)
        if(startIndex == arr.length){
            int[] output = new int[0];
            return output;
        }
        // Getting the recursive answer in smallOutput array
        int smallOutput[] = allIndexes(arr, x, startIndex+1);
        if(arr[startIndex] == x){
            int[] output = new int[smallOutput.length+1];
            // Put the start index in front of the array
            output[0] = startIndex;

            // Shift the elements of the array one step to the right and putting them in output array
            for (int i  = 0 ; i<smallOutput.length ; i++){
                output[i+1] = smallOutput[i];
            }
            return output;
        }
        else{
            // If the element at start index is not equal to x then just simply return the answer which came from recursion.
            return smallOutput;
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int arr[] = takeInput();
        System.out.println("enter the no to be searched: ");
        int x = scn.nextInt();
        int[] ans = allIndexes(arr, x, 0); 
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
        
    }
}
