package Array_2d;

import java.util.Arrays;
import java.util.Scanner;

public class Wave_print {

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

    public static void printWave(int [][] arr){
        for (int j = 0 ; j<arr[0].length; j++){
            if(j%2==0){
                for(int i = 0 ; i<arr.length ; i++){
                    System.out.print(arr[i][j]+" ");
                }
            }
            else{
                for(int i = arr.length-1 ; i>=0 ; i--){
                    System.out.print(arr[i][j]+" ");
                }
            }
        }
    }

    public static void main(String[] args) {
        int[][] arr1 = takeInput();
        printWave(arr1);
    }
    
    
}
