package Sorting;
import java.util.Scanner;

public class Merge_two_sorted {

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
    
    public static int[] Merge_two_sorted(int[] arr1,int[] arr2){
        int i = 0 , j = 0 , k = 0;
        int[] ans = new int[arr1.length+arr2.length];
        while (i<arr1.length && j<arr2.length){
            if(arr1[i]<arr2[j]){
                ans[k] = arr1[i];
                i++;
                k++;
            }
            else{
                ans[k] = arr2[j];
                j++;
                k++;
            }
        }
        while(i<arr1.length){
            ans[k] = arr1[i];
            k++;
            i++;
        }
        while(j<arr2.length){
            ans[k] = arr2[j];
            k++;
            j++;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr1 = input();
        int[] arr2 = input();
        int arr3[] = Merge_two_sorted(arr1, arr2);
        for(int i = 0; i<arr3.length; i++){
            System.out.print(arr3[i]+" ");
        }
    }

}
