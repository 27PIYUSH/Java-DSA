package Array;
import java.util.Scanner;

public class Find_unique {

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
    
    public static int unique(int[]arr){
        for (int i = 0;i <arr.length; i++){
            boolean ispresent = false;
            for (int j = 0 ; j<arr.length ; j++){
                if (i != j){
                    if (arr[i] == arr[j]){
                        ispresent = true;
                    }
                }
            }
            if(ispresent == false){
                return arr[i];
            }
        }
        return 0;
    }
    
    public static void main(String[] args) {
        int[] arr = input();
        System.out.println(unique(arr));
    }
    
}
