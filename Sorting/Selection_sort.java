package Sorting;
import java.util.Scanner;

public class Selection_sort {

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

    public static void selection_sort(int[] arr){
        for (int i = 0 ; i<arr.length-1  ; i++){
            int min = i;
            for (int j = i+1; j<arr.length; j++){
                if(arr[j]<arr[min]){
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = input();
        selection_sort(arr);
        for (int i = 0 ; i<arr.length ;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
