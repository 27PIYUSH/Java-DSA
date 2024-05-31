package Complexity;
import java.util.*;

public class Equilibrium {

    public static int[] takeInput(){
        Scanner scn = new Scanner(System.in);
        System.out.print("enter the no of elements: ");
        int n = scn.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the elements: ");
        for(int i = 0 ; i<n ; i++){
            arr[i] = scn.nextInt();
        }
        return arr;
    }

    public static int equilibrium(int arr[]){
        int rightSum = 0 ,leftSum = 0 ;

        // take the sum of whole array as right sum
        for (int i = 0 ; i<arr.length ; i++){
            rightSum += arr[i];
        }

        // decrement the right sum and increment the left sum
        for(int index = 0 ; index<arr.length ;index++){
            rightSum -= arr[index];

            if(rightSum == leftSum){
                return index;
            }
            leftSum += arr[index];
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = takeInput();
        System.out.println(equilibrium(arr));
    }
    
}
