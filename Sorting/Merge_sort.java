package Sorting;

import java.util.Scanner;

public class Merge_sort {

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


    public static void mergeSort(int arr[] , int start , int end){
        if (start>=end){
            return;
        }
        int mid = (start+end)/2;
        mergeSort(arr, start, mid);
        mergeSort(arr, mid+1, end);
        merge(arr, start, end);
    }

    private static void merge(int[] arr, int start , int end){
        int mid = (start+end)/2;
        int ans[] = new int[end-start+1];
        int i = start, j = mid+1, k = 0;
        while(i<=mid && j <=end){
            if(arr[i]< arr[j]){
                ans[k] = arr[i];
                k++;
                i++;
            }
            else{
                ans[k] = arr[j];
                k++;
                j++;
            }
        }

        while(i<=mid){
            ans[k] = arr[i];
            k++;
            i++;
        }

        while(j<=end){
            ans[k] = arr[j];
            k++;
            j++;
        }

        // copying the elements into original array:::
        for(int index = 0 ; index<ans.length ; index++){
            arr[start+index] = ans[index];
        }
    }

    public static void mergeSort(int[] arr){
        mergeSort(arr, 0, arr.length-1);
    }

    public static void main(String[] args) {
        int[] arr = takeInput();
        mergeSort(arr);
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    
}
