package Array;
import java.util.Scanner;
public class Arrange_nos {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int i = 0 , j = n-1 , val =1;
        int[] arr = new int[n];
        while(i<j){
            arr[i] = val;
            val++;
            i++;
            arr[j] = val;
            val++;
            j--;
        }
        if(i == j) {
            arr[i] = n;
        }
        for(i=0 ; i<n ; i++){
            System.out.print(arr[i]+" ");
        }
    }   
}