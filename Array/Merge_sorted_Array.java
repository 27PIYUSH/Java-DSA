package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Merge_sorted_Array {

    public static int[] input(){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        System.out.println("enter " + n +" elements: ");
        for (int i = 0 ; i<arr.length ; i++){
            arr[i] = scn.nextInt();
        }
        return arr;

    }

    public static void merge(int arr1[] , int arr2[]){
        int k=arr1.length+arr2.length;
        int[] arr3 = new int[k];
        int i = 0 , j = 0 , p = 0;
        while(i<arr1.length && j<arr2.length){
            if (arr1[i]>arr2[j]){
                arr3[p] = arr2[j];
                j++;
                p++;
            }
            else {
                arr3[p] = arr1[i];
                i++;
                p++;
            }
        }
        while(i<arr1.length){
            arr3[p] = arr1[i];
            i++;
            p++;
        }
        while(j<arr2.length){
            arr3[p] = arr2[j];
            j++;
            p++;
        }
        System.out.println(Arrays.toString(arr3));

    }
        public static void main(String[] args) {
        int[] arr1 = input();
        int[] arr2 = input();
        merge(arr1, arr2);
    }
    
}
