package Recursion;

import java.util.Scanner;

public class Count_Zeroes {

    	public static int countZerosRec(int input){
		if(input==0) //Just to handle the case when input=0 
		{
			return 1;
		}
		if(input<10)//this is the actual base case
		{
			return 0;			
		}
		else if(input%10==0)
		{
			return 1+countZerosRec(input/10);
		}
		return countZerosRec(input/10);

	}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the no.: ");
        int s = sc.nextInt();
        System.out.println("Zeroes =  " + countZerosRec(s));
    }
}

/*Working
 * 
 * the recursive call is done in the following Manner 
 * initially from main(10204)
 * 1st recursive call return countZerosRec(input/10);    (1020)
 * 2nd recursive call return 1+countZerosRec(input/10);  (1+countZerosRec(102))
 * 3rd recursive call return countZerosRec(input/10);    (10)
 * 4th recursive call return 1+countZerosRec(input/10);  (1+countZerosRec(1))
 * Now Falling Back of Recursive Calls
 * 3rd recursive call return countZerosRec(input/10);    (1)
 * 2nd recursive call return 1+countZerosRec(input/10);  (2)
 * 1st recursive call return countZerosRec(input/10);    (2)
 *  2  will be returned to the main
 * */
    

