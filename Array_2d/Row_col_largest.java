package Array_2d;

import java.util.Scanner;

public class Row_col_largest {
    
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

    public static void largest(int[][] arr){
        boolean isRow = true;
        int largest_row = 0;
        int largest_col = 0;
        int num = 0;
        // largest row
        for(int i = 0 ; i<arr.length; i++){
            int row_sum = 0;
            for(int j = 0 ; j<arr[0].length ; j++){
                row_sum += arr[i][j];
            }
            if (row_sum>largest_row){
                largest_row = row_sum;
                num = i;
            }
        }

        // largest col
        for(int j = 0 ; j<arr[0].length ; j++){
            int col_sum = 0;
            for(int i = 0 ; i<arr.length;i++){
                col_sum += arr[i][j];
            }
            if (col_sum>largest_col){
                largest_col = col_sum;
                num =j;
                isRow = false;
            }
        }

        // print
        if (isRow){
            System.out.println("row " + num +" " + largest_row);
        }
        else{
            System.out.println("col " + num +" " + largest_col);
        }

    }

    public static void main(String[] args) {
        int[][] arr =takeInput();
        largest(arr);
    }
}
