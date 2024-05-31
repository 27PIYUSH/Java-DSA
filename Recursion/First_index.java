package Recursion;

import java.util.Scanner;

public class First_index {

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

    private static int Index(int[] arr,int x,int start){
        if(start ==  arr.length){
            return -1;
        }
        else if(arr[start]==x){
            return start;
        }
        else{
            return Index(arr, x, start+1);
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int[] arr = takeInput();
        System.out.print("enter the no to be searched: ");
        int x = scn.nextInt(); 
        System.out.println(Index(arr, x , 0));
    }
}
