package Complexity;

import java.util.*;


public class Duplicate_array {

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
    
    // USING XOR::: O(n) complexity
    public static int find_duplicate(int[] arr){
        int XOR = 0 ;
        for(int i = 0 ; i < arr.length; i++){
            XOR ^= arr[i];
        }
        for(int i = 0 ; i <=arr.length-2 ; i++){
            XOR ^= i ;
        }
        return XOR;
    }

    // 2nd method ::: O(n) complexity 
    public static int find_duplicatee(int[] arr){
        int sum = 0 ; 
        int n =arr.length;
        for(int i = 0 ; i < n ; i++){
            sum += arr[i];
        }
        int sumOfNaturalNos = ((n-1)*(n-2)/2);
        return sum - sumOfNaturalNos;
    }

    // 3rd method ::: o(n log n) complexity
    static void find_duplicateee(int[] arr){
        Arrays.sort(arr);
        for(int i = 0 ; i<arr.length-1 ; i++){
            if(arr[i] == arr[i+1]){
                System.out.print(arr[i] + " ");
            }
        }
    } 

    public static void main(String[] args) {
        int [] arr = takeInput();
        // System.out.println(find_duplicate(arr));
        // System.out.println(find_duplicatee(arr));
        find_duplicateee(arr);

    }
}
