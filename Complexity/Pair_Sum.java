package Complexity;

import java.util.*; 

public class Pair_Sum {

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

    public static int pair_sum(int[] arr, int num){
        Arrays.sort(arr);
        int start = 0;
        int end = arr.length - 1;
        int numPair = 0;
        while (start<end){
            if(arr[start]+arr[end]>num){
                end--;
            }
            else if(arr[start]+arr[end]<num){
                start++;
            }
            else{
                int elementAtStart = arr[start];
                int elementAtEnd = arr[end];
                // if the elements are repeated ::: 2 2 2 2 2
                if(elementAtStart == elementAtEnd){
                    int totalElementsFromstartToEnd = end - start +1;
                    numPair += (totalElementsFromstartToEnd*(totalElementsFromstartToEnd-1)/2);
                    return numPair;
                }
                ++numPair;
                end--;
                start++;
            }
        }
        return numPair;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] arr = takeInput();
        System.out.print("enter the no: ");
        int n = s.nextInt();
        System.out.println(pair_sum(arr, n));
    }
    
}
