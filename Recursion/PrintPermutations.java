package Recursion;
import java.util.*;

public class PrintPermutations {

    static void permutations(char[] arr , int fixedIndex){
        if(fixedIndex == arr.length-1){
            System.out.println(arr);
            return;
        }
        for (int i = fixedIndex; i < arr.length; i++) {
            swap(arr,i,fixedIndex);
            permutations(arr, fixedIndex+1);
            swap(arr,i,fixedIndex);
        }
    }

    static void swap(char[] arr , int i , int fixedIndex){
        char temp = arr[i];
        arr[i] = arr[fixedIndex];
        arr[fixedIndex] = temp;
    }
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = scn.next();
        permutations(str.toCharArray(), 0);
    }

}
