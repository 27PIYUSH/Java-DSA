package Sorting;
import java.util.Scanner;
public class Rotate_array {

    public static int[] input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter no. of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter elements of array: ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static void rotate(int [] arr , int k){
        k = k % arr.length;
        reverse(arr, 0, arr.length-1);
        reverse(arr, 0, k-1); // towards left
        reverse(arr, k , arr.length-1);

        // reverse(arr, 0, arr.length-k-1); // towards gight
        // reverse(arr, arr.length-k, arr.length-1);
    }
    
    public static void reverse(int[] arr, int start ,int end){
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int[] arr = input();
        System.out.print("no. of times to rotate array: ");
        int k = scn.nextInt();
        rotate(arr,k);
        for (int i = 0 ; i<arr.length ;i++){
            System.out.print(arr[i]+" ");
        }
    } 
}
