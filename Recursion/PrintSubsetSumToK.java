package Recursion;

import java.util.Scanner;

public class PrintSubsetSumToK {
    
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

    public static void subsethelper(int[] arr , int startindex , int[] outputSoFar, int k){
        if(startindex == arr.length){
            if(k==0){
                for (int i : outputSoFar) {
                System.out.print(i + " ");
            }
            System.out.println();
            return;
            }
            else{
                return;
            }
        }

        int[] newOutput = new int[outputSoFar.length+1];
        int i = 0;
        for ( ; i < outputSoFar.length; i++) {
            newOutput[i] = outputSoFar[i];
        } 
        newOutput[i] = arr[startindex];
        subsethelper(arr, startindex+1, outputSoFar, k);
        subsethelper(arr, startindex+1, newOutput, k - arr[startindex]);
    }

    public static void printSubsetsSumToK(int[] arr, int k){
        int[] outputSoFar = new int[0];
        subsethelper(arr, 0, outputSoFar, k);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int[] arr = takeInput();
        System.out.print("Enter the sum: ");
        int k = scn.nextInt();
        printSubsetsSumToK(arr, k);
    }
}
