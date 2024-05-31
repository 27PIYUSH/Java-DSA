package Basic;

import java.util.Scanner;

public class Fun {
    public static int factorial(int n){
        int ans = 1;
        for (int i = 1; i<=n;i++){
            ans = ans*i;
        }
        return ans;
    }

    public static boolean isprime(int n){
        for (int i=2;i<n;i++){
            if (n%i==0){
                return false;
            }
        }
        return true;
    }

    public static void print(int n){
        for (int i=0 ; i<=n ; i++){
            System.out.print(i + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean ans = isprime(n);
        System.out.println(factorial(n));
        System.out.println(ans);
        print(n);
    }
}
