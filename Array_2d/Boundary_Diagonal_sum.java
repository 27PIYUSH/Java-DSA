package Array_2d;

import java.util.Scanner;

public class Boundary_Diagonal_sum {

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

    public static int boundary_Sum(int arr[][]){
        int sum = 0;
        for(int i = 0 ; i<arr.length ; i++){
            for(int j = 0 ; j < arr.length ; j++){
                if(i == 0 || i == arr.length-1 || j == 0 || j == arr.length-1 || i == j || j == arr.length-i-1){
                    sum += arr[i][j];
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[][] arr1 = takeInput();
        System.out.println(boundary_Sum(arr1));
    }
}
