package Array_2d;
import java.util.Scanner;

public class arrayFunctions {

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
    public static void printArray(int[][] arr){
        System.out.println("THE MATRIX IS: ");
        for(int i  = 0 ; i<arr.length ; i++){
            for (int j = 0 ; j<arr[0].length ; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] arr = takeInput();
        printArray(arr);
    }
}
