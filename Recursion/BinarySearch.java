package Recursion;

import java.util.Scanner;

public class BinarySearch {
    
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

    private static int binarySearch(int[] arr, int start , int end, int x){
        if(start > end){
            return -1;
        }
        int mid = (start+end)/2;
        if(arr[mid] == x){
            return mid;
        }
        else if(arr[mid]>x){
            return binarySearch(arr, start, mid-1, x);
        }
        else{
            return binarySearch(arr, mid+1, end, x);
        }
    }

    public static int binarySearch(int[] arr , int x){
        return binarySearch(arr, 0, arr.length-1, x);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int[] arr = takeInput();
        System.out.print("Enter the no. to be searched: ");
        int ele = scn.nextInt();
        System.out.println(binarySearch(arr, ele));
    }
}
