package ArrayList;
import java.util.*;

public class Remove_duplicatesArray {

    static int[] takeinput(){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter no. of elements: ");
        int n = scn.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements of array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        return arr;
    }
    
    static ArrayList<Integer> removeConsecutiveDuplicates(int[] arr){
        ArrayList<Integer> result = new ArrayList<>();
        result.add(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] != arr[i-1]){
                result.add(arr[i]);
            }
        }
        return result;
    }

    static void print( ArrayList<Integer> result){
        for(Integer x : result){
            System.out.print(x+" ");
        }
    }

    public static void main(String[] args) {
        int[] arr = takeinput();
        ArrayList<Integer> result= removeConsecutiveDuplicates(arr);
        print(result); 
    }
}
