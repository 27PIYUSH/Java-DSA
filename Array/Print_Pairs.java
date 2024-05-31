package Array;
import java.util.Scanner;

public class Print_Pairs {

    public static int[] input(){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.println("enter " + n +" elements: ");
        int[] arr = new int[n];
        for (int i = 0 ;  i<n ; i++){
            arr[i] = scn.nextInt();
        }
        return arr;
    }
    
    public static void print_pair(int[] arr){
        for (int i = 0 ; i<arr.length-1 ; i++){
            for (int j = i+1; j<arr.length ;j++){
                System.out.println("("+arr[i] +" , "+ arr[j] +")");
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = input();
        print_pair(arr);
    }
    
}
