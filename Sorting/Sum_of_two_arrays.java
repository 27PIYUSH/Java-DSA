package Sorting;
import java.util.Scanner;

public class Sum_of_two_arrays {

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

    // PRINT ARRAY:::
    public static void printArray(int[] arr) {
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void Sum_of_two_arrays(int[] arr1,int[] arr2,int [] output){
        int i = arr1.length-1;
        int j = arr2.length-1;
        int carry = 0;
        
        int k = Math.max(i,j) + 1;        
        
        while(i >= 0 && j>=0){
            int sum = arr1[i] + arr2[j] + carry;
            output[k] = sum%10;
            carry = sum/10;
            i--;
            j--;
            k--;
        }
        
        while(i >= 0){
            int sum = arr1[i] + carry;
            output[k] = sum%10;
            carry = sum/10;
            i--;
            k--;
        }
        while(j >= 0){
            int sum = arr2[j] + carry;
            output[k] = sum%10;
            carry = sum/10;
            j--;
            k--;
        }
        output[0] = carry;
    }

    public static void main(String[] args) {
        int[] arr1 = input();
        int[] arr2 = input();
        int[] output = new int[ Math.max(arr1.length, arr2.length) + 1];
        Sum_of_two_arrays(arr1, arr2, output);
        printArray(output);
    }
}