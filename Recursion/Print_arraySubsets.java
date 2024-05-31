package Recursion;

import java.util.Scanner;

public class Print_arraySubsets {
    
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

    static void subsethelper(int[] arr,int startindex,int[] output){
        if(startindex == arr.length){
            for (int i : output) {
                System.out.print(i + " ");
            }
            System.out.println();
            return;
        }
        // create newOutput array and copy the content of output array & the append the startindex
        int[] newOutput = new int[output.length+1];
        int i = 0;
        for( ; i<output.length ; i++){
            newOutput[i] = output[i];
        }
        newOutput[i] = arr[startindex];
        // when we do not include the startindex
        subsethelper(arr, startindex+1, output);
        // when we include the startindex
        subsethelper(arr, startindex+1, newOutput);
    }

    static void printSubsets(int[] arr){
        int[] output = new int[0];
        subsethelper(arr, 0, output);
    }

    public static void main(String[] args) {
        int[] arr = takeInput();
        printSubsets(arr);
    }
}
