package Recursion;

import java.util.Scanner;

public class TowerOfHanoi {
    
    static void TOH(int disks , char source , char auxiliary , char destination){
        if (disks == 0){
            return;
        }
        TOH(disks-1 , source , destination , auxiliary);
        System.out.println(source+" "+destination);
        TOH(disks-1 , auxiliary , source , destination);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter no. of disks: ");
        int n = scn.nextInt();
        TOH(n, 'A', 'B', 'C');
    }

}
