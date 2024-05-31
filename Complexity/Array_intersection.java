package Complexity;

import java.util.*;

public class Array_intersection {

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

    public static void intersection(int[] arr1 , int[] arr2){
        Arrays.sort(arr1);
        Arrays.sort(arr1);
        int i = 0;
        int j = 0;
        while(i <arr1.length && j<arr2.length){
            if(arr1[i]==arr2[j]){
                System.out.print(arr1[i]+ " ");
                i++;
                j++;
            }else if(arr1[i] < arr2[j]){
                i++;
            }else{
                j++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr1 = takeInput();
        int[] arr2 = takeInput();
        intersection(arr1,arr2);
    }
    
}
