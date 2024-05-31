package Recursion;

import java.util.*;

public class Sum_array {
    
    public static int[] input(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter " + n +" elements: ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        return arr;
    }
    
    private static int SumArray(int [] arr,int start) {
        if(start ==  arr.length){
            return 0;
        }
        else{
            return arr[start]+SumArray(arr,start+1);
        }
    }

    public static int SumArray(int [] arr){
        return SumArray(arr, 0);
    }

    public static void main(String[] args) {
        int [] arr = input();
        System.out.println(SumArray(arr));

    }

}
