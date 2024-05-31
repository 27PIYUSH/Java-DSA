package Sorting;
import java.util.Scanner;

public class Insertion_sort {

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

    public static void Insertion_sort(int[] arr){
        for (int i = 1 ; i<arr.length ; i++){
            int j = i-1;
            int key = arr[i];
            while(j>=0 && arr[j]>key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    } 

    public static void main(String[] args) {
        int[] arr = input();
        Insertion_sort(arr);
        for (int i = 0 ; i<arr.length ;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
