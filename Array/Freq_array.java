package Array;

import java.util.Scanner;

public class Freq_array {

    static int[] takeinput(){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the no. of elements: ");
        int n = scn.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of array: ");
        for(int i = 0 ; i <n ; i++){
            arr[i] = scn.nextInt();
        }
        return arr;
    }

    static int[] makeFreqArray(int[] arr){
        int[] freq = new int[100005];
        for(int i = 0 ; i <arr.length ; i++){
            freq[arr[i]]++;
        }
        return freq;
    }

    public static void main(String[] args) {
        int[] arr = takeinput();
        int[] freq = makeFreqArray(arr);
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the no of queries: ");
        int q = scn.nextInt();
        while(q>0){
            System.out.println("enter the no. to be searched: ");
            int x = scn.nextInt();
            if(freq[x]>0){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
            q--;
        }
    }
    
}
