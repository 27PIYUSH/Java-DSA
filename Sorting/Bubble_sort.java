package Sorting;
import java.util.Scanner;

public class Bubble_sort {

    public static int[] input(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter " + n +" elements: ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static void Bubble_sort(int[] arr){
        for (int i = 0 ; i<arr.length-1; i++){
            for (int j = 0 ; j<arr.length-i-1; j++){
                if (arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }  
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = input();
        Bubble_sort(arr);
        for (int i = 0 ; i<arr.length ;i++){
            System.out.print(arr[i]+" ");
        }
    }
}