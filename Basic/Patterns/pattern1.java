package Basic.Patterns;

import java.util.Scanner;

public class pattern1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int i = 1;
        while (i<=n){
            int s = 1;
            while (s<=n-i){
                System.out.print(" ");
                s++;
            }
            int j = 1;
            int var = i;
            while (j<=i){
                System.out.print(var);
                var++;
                j++;
            }
            int var2 = 2*i-2;
            j = 1;
            while(j<=i-1){
                System.out.print(var2);
                var2--;
                j++;
            }
            System.out.println();
            i++;
        }
    }
    
}
