package ArrayList;
import java.util.*;

public class ReverseArraylist {
    
    static int[] takeInput(){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = scn.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements of array: ");
        for(int i = 0 ; i<arr.length ; i++){
            arr[i] = scn.nextInt();
        }
        return arr;
    }

    static ArrayList<Integer> reverse(int[] arr,int m){
        ArrayList<Integer> result = new ArrayList<>();
        for(int i = 0 ; i < arr.length ; i++){
            if(i >= m){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
                
            }
            result.add(arr[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scn  = new Scanner(System.in);
        int[] arr = takeInput();
        System.out.print("Enter m to reverse the arr: ");
        int m = scn.nextInt();
        ArrayList<Integer> ans = reverse(arr, m);
        for (Integer ele : ans) {
            System.out.print(ele + " ");
        }

    }
}
