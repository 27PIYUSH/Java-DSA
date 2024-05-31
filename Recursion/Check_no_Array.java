package Recursion;

import java.util.*;

public class Check_no_Array {

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

    private static boolean checkNoInArray(int [] arr,int start, int x){
        if(start == arr.length){
            return false;
        }
        else if(arr[start]==x){
            return true;
        }
        else{
            return checkNoInArray(arr, start+1, x);
        }
    }

    public static boolean checkNoInArray(int [] arr, int x){
        return checkNoInArray(arr, 0, x);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int[] arr= takeInput();
        System.out.print("Enter the element to be searched: ");
        int x = scn.nextInt();
        System.out.println(checkNoInArray(arr , x));
    }
}
