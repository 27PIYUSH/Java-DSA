package Basic.Patterns;
import java.util.Scanner;

public class pattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int n1 = (n+1)/2;
        int n2 = n - n1;
        int i = 1;
        while (i<=n1){
            int s = 1;
            while (s<=n1-i){
                System.out.print(" ");
                s++;
            }
            int j = 1;
            while (j<=2*i-1){
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
        i = n2;
        while (i>=1){
            int s = 1;
            while (s<=n2-i+1){
                System.out.print(" ");
                s++;
            }
            int j = 1;
            while (j<=2*i-1){
                System.out.print("*");
                j++;
            }
            System.out.println();
            i--;
        } 

    }
}
