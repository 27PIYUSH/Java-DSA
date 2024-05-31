package Array;
import java.util.Scanner;

public class Sort_01 {

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

    public static int[] sort(int[] arr){
        int next0 = 0;
        for(int i = 0; i<arr.length ; i++ ){
            if (arr[i] == 0){
                int temp = arr[next0];
                arr[next0] = arr[i];
                arr[i] = temp;
                next0++;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = input();
        sort(arr);
        for (int i = 0; i<arr.length; i++){
            System.out.print(arr[i] +" ");
        }
    }
    
}
