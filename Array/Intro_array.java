package Array;

import java.util.Scanner;

public class Intro_array {
    // TAKING INPUT:::
    public static int[] input() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i<n ;i++){
            System.out.print("enter element at "+ i + "th index: ");
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    // PRINTING ARRAY ELEMENTS:::
    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // SUM OF ELEMENTS:::
    public static int sum(int[]arr){
        int sum = 0;
        for (int i = 0 ; i<arr.length ; i++){
            sum += arr[i];
        }
        return sum;
    }

    // LARGETS IN ARRAY:::
    public static int largest(int[] arr){
        int largest = -1;
        for (int i = 0; i<arr.length; i++){
            if (arr[i]>largest){
                largest = arr[i];
            }
        }
        return largest;
    }

    // LINEAR SEARCH:::
    public static int linear_search(int[] arr){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter no to be searched: ");
        int x = sc.nextInt();
        for(int i = 0 ; i<arr.length;i++){
            if (arr[i]==x){
                System.out.println("element found at index "+ i);
            }
        }
        return -1;
    }

    //MAIN FUNCTION:::
    public static void main(String[] args) {
        int [] arr = input();
        print(arr);
        System.out.println("sum: "+sum(arr));
        System.out.println("largest: "+largest(arr));
        linear_search(arr);
    }
    
}
