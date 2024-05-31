package Complexity;

import java.util.*;

public class find_unique {

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

    // using xor::: O(n) complexity
    public static int find_uniquee(int arr[]){
        int XOR = 0;
        for(int i = 0; i <arr.length; i++){
            XOR ^= arr[i];
        }
        return XOR;
    }

    // public static int find_uniqueee(int arr[]){
    //     Arrays.sort(arr);
    //     for(int i = 0 ; i<arr.length-1 ;i+=2 ){
    //         if(arr[i]!=arr[i+1]){
    //             System.out.println("11");
    //             return arr[i];
    //         }
    //     }
    //     return -1;
    // }
    
    public static void main(String[] args) {
        int[] arr = takeInput();
        System.out.println(find_uniquee(arr));
        // System.out.println(find_uniqueee(arr));
    }
}
