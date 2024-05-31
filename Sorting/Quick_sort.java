package Sorting;

import java.util.Scanner;

public class Quick_sort {

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
    
    public static int partition(int[] arr, int start ,int end){
        int pivot = arr[start];
        int count = 0;
        // count no of elements smaller than pivot
        for(int i = start+1 ; i<=end ; i++){
            if(arr[i] <= pivot){
                count++;
            }
        }
        //placing pivot at its position
        int pivotIndex = start+count;
        arr[start] = arr[pivotIndex];
        arr[pivotIndex] = pivot;
        
        // arranging the elements in asc & des order before & after the pivot
        int i = start , j = end;
        while(i < pivotIndex && j > pivotIndex){
            if(arr[i]<=pivot){
                i++;
            }
            else if(arr[j]>pivot){
                j--;
            }
            else{
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
            
        return pivotIndex;
    }

    private static void quickSort(int[] arr, int start, int end){
        if(start>=end){
            return;
        }
        int partitionIndex = partition(arr, start, end);
        quickSort(arr, start, partitionIndex-1);
        quickSort(arr, partitionIndex+1, end);
    }

    public static void quickSort(int[] arr){
        quickSort(arr, 0, arr.length-1);
    }

    public static void main(String[] args) {
        int[] arr = takeInput();
        quickSort(arr);
        for(int i = 0 ; i <arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}
