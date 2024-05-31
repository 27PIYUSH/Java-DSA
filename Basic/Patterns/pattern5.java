package Basic.Patterns;
import java.util.Scanner;
public class pattern5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        System.out.println("*");
        while(i<=n){
            System.out.print("*");
            int j = 1;
            int var = 1;
            while ( j<=i){
                System.out.print(j);
                j++;
            }
            j= j-2;
            while(j>=1){
                System.out.print(j);
                j--;
            }
            System.out.println("*");
            i++;
        }    
            i = 1;
            while(i<n){
                System.out.print("*");
                int j = 1;
                while(j<=n-i){
                    System.out.print(j);
                    j++;
                }
                j=j-2;
                while(j>=1){
                    System.out.print(j);
                    j--;
                }

            System.out.println("*");
            i++;
        }
        System.out.println("*");
        
    }
    
}
