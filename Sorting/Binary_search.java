package Sorting;
import java.util.Scanner;

public class Binary_search {

    public static int[] input(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter " + n +" elements: ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static int Binar_search(int[] arr){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter no to be searched: ");
        int x = sc.nextInt();
        int low = 0;
        int high = arr.length - 1;
        while(low<=high){
            int mid = (low+high)/2;
            if (arr[mid]==x){
                return mid;
            }
            else if(arr[mid]>x){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        int[] arr = input();
        System.out.println(Binar_search(arr));
    }
    
}
