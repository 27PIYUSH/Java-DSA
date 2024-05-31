package Array_2d;
import java.util.Scanner;

public class Total_sum {
    public static int[][] takeInput(){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the number of rows: ");
        int row = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int col = sc.nextInt();
        int arr[][] = new int[row][col];
        System.out.println("Enter elements of array: ");
        for (int i = 0; i<row ; i++){
            for(int j = 0; j <col; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        return arr;

    }

    public static int sum(int[][]arr){
        int total = 0;
        for(int i = 0 ; i<arr.length; i++){
            for(int j = 0 ; j<arr[0].length; j++){
                total += arr[i][j];
            }
        }
        return total;

    }

    public static void main(String[] args) {
        int[][] arr = takeInput();
        System.out.println(sum(arr));
    }
    
}
