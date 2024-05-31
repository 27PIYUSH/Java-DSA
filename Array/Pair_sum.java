package Array;
import java.util.Scanner;

public class Pair_sum {

    public static int[] input(){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        System.out.println("enter "+ n +" elements");
        for (int i = 0; i<n; i++){
            arr[i] = s.nextInt();
        }
        return arr;
    }

    public static int pair(int[] arr,int x){
        int pairs = 0;
        for (int i = 0 ; i<arr.length-1 ; i++){
            for ( int j = i+1; j<arr.length ; j++){
                    if (arr[i]+arr[j] == x){
                        pairs += 1;
                    }
                }
            }
            return pairs;
        }

    public static void main(String[] args) {
        int[] arr = input();
        Scanner s = new Scanner(System.in);
        System.out.print("enter the element to find pairs: ");
        int x = s.nextInt();
        System.out.println(pair(arr, x));
    }
    
}
