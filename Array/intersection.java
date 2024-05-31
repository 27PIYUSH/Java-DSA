package Array;
import java.util.Scanner;

public class intersection {

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
    public static void Arrayintersection(int[] arr1,int[] arr2){
        for(int i = 0; i <arr1.length; i++){
            for(int j = 0; j<arr2.length ;j++){
                if(arr1[i] == arr2[j]){
                    System.out.print(arr1[i] + " ");
                    arr2[j] = Integer.MIN_VALUE;
                    break;
                }

            }
        }

    }
    public static void main(String[] args) {
        int[] arr1 = input();
        int[] arr2 = input();
        Arrayintersection(arr1, arr2);
    }
    
}
