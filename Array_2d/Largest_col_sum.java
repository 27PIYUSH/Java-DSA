package Array_2d;

import java.util.Scanner;

public class Largest_col_sum {

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

    public static int largest(int [][] arr){
        int largest = 0 ;
        for(int j = 0; j<arr[0].length ; j++){
            int sum = 0;
            for(int i = 0 ; i<arr.length ;i++){
                sum += arr[i][j];
            }
            if (sum>largest){
                largest = sum;
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        int [][] arr = takeInput();
        System.out.println(largest(arr));
    }
    
}
