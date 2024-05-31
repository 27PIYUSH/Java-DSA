package Recursion;

import java.util.Scanner;

public class Check_sorted {

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

    private static boolean checkSorted(int arr[], int start){

        if(start >= arr.length-1){
            return true;
        }
        else if(arr[start]>arr[start+1]){
            return false;
        }
        else{
            return checkSorted(arr, start+1);
        }
    }
    
    public static boolean checkSorted(int arr[]){
        return checkSorted(arr,0);
    }

    public static void main(String[] args) {
        int[] arr = takeInput();
        System.out.println(checkSorted(arr));
    }
}
