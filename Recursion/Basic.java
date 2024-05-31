package Recursion;
import java.util.*;
public class Basic {

    static int fact(int n){
        if(n==1){
            return 1;
        }
        else{
            return n*fact(n-1);
        }
    }

    static int sum(int n){
        if (n==1){
            return 1;
        }
        else{
            return n+sum(n-1);
        }
    }

    static int power(int x ,int n){
        if(x==0){
            return 0;
        }
        else if(n==0){
            return 1;
        }
        else if(x==0 && n==0){
            return 1;
        }
        else{
            return x *power(x,n -1);
        }
    }

    static int numOfDigits(int n){
        if(n==0){
            return 0;
        }
        else{
            return numOfDigits(n/10)+1;
        }
    }

    static int fibo(int n){
        if(n==0 || n==1){
            return n;
        }
        else{
            return fibo(n-2)+fibo(n-1);
        }
    }

    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("enter the no.: ");
        int x = scn.nextInt();
        // System.out.print("enter the power: ");
        // int n=scn.nextInt();
        // System.out.println("Factorial = "+fact(x));
        // System.out.println("Sum = "+sum(x));
        // System.out.println("Power of number is: " + power(x,n));
        // System.out.println("Count: "+numOfDigits(x));
        System.out.println("Fibonacci: " +fibo(x));
    }
    
}
