package Array;
import java.util.Scanner;

public class Find_Duplicate {

    public static int[] input(){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        System.out.println("enter " +n+" elements:" );
        for (int i = 0; i<n ; i++){
            arr[i] = scn.nextInt();
        }
        return arr;
    }

    public static int duplicate(int[] arr){
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr.length; j++){
                if (i!=j){
                    if (arr[i]==arr[j]){
                        return arr[i];
                    }
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] arr = input();
        System.out.println(duplicate(arr));
    }
    
}