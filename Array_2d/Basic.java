package Array_2d;
import java.util.Scanner;

public class Basic {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("ENTER NO. OF ROWS: ");
        int rows = s.nextInt(); 
        System.out.print("ENTER NO. OF COLUMNS: ");
        int col = s.nextInt();
        int[][] arr = new int [rows][col];

        int[][] arr2 = {{1,2,3},{4,5,6}}; // can be initialized like this

    // input:::
        System.out.println("ENTER THE ELEMENTS: ");
        for(int i = 0; i<rows ; i++){
            for(int j = 0 ; j<col ; j++){
                arr[i][j] = s.nextInt(); 
            }
        }
    // output:::
        System.out.println("THE MATRIX IS: ");
        for (int i = 0; i<rows ; i++){
            for (int j = 0; j<col ; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(arr2.length);
        System.out.println(arr2[0].length);
 
    }
}