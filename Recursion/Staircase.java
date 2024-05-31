package Recursion;

import java.util.Scanner;

public class Staircase {
    
    static int staircase(int n){
        if(n<0){
            return 0;
        }
        if(n==0){
            return 1;
        }
        return staircase(n-1) + staircase(n-2) + staircase(n-3);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = scn.nextInt();
        System.out.println(staircase(n));
    }
}
