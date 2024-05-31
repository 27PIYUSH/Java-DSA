package Array_2d;
import java.util.Scanner;

public class Spiral_print {

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

    public static void Spiral_print(int[][] arr){
        int col_start = 0;
        int col_end = arr[0].length - 1;
        int row_start = 0;
        int row_end = arr.length - 1;
        while(row_start<=row_end && col_start<=col_end){

            for(int i = col_start ; i<=col_end ; ++i ){
                System.out.print(arr[row_start][i]+ " ");
            }
            row_start++;

            for(int i = row_start ; i<=row_end ;++i){
                System.out.print(arr[i][col_end] + " ");
            }
            col_end-- ;

            if(row_start <= row_end && col_start<= col_end){
                for(int i = col_end; i>=col_start ;--i ){
                    System.out.print(arr[row_end][i] + " ");
                }
                row_end--;

                for(int i = row_end ; i>=row_start ; --i){
                    System.out.print(arr[i][col_start] + " ");
                }
                col_start++;
            }
        }
    }

        public static void main(String[] args) {
        int[][] arr = takeInput();
        Spiral_print(arr);
    }
    
    
}
