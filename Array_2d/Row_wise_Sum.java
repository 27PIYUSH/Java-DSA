package Array_2d;
import java.util.Scanner;

public class Row_wise_Sum {

    public static int[][] takeInput(){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the no. of rows: ");
        int row = s.nextInt();
        System.out.print("Enter the no. of cols: ");
        int col = s.nextInt();
        int [][] arr = new int [row][col];
        System.out.println("enter the elements of array: ");
        for(int i = 0 ;  i<row; i++){
            for(int j = 0 ; j<col; j++){
                arr[i][j] = s.nextInt();
            }
        }
        return arr;
    }
    public static void Sum(int[][] arr){
        System.out.println("THE SUM IS: ");
        for(int i  = 0 ; i<arr.length ; i++){
            int sum = 0;
            for (int j = 0 ; j<arr[0].length ; j++){
                sum += arr[i][j];
            }
            System.out.print(sum + " ");
        }
    }


    public static void main(String[] args) {
        int[][] arr = takeInput();
        Sum(arr);
    }
}