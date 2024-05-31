import java.util.Scanner;

public class UseStack {
    
    public static void main(String[] args) throws StackFullException, StackEmptyException {

        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the size of stack: ");
        int  n = scn.nextInt();
        // for array:::
        // StackUsingArray stack = new StackUsingArray(n);
        
        // For LinkedList
        StackUsingLinkedList<Integer> stack = new StackUsingLinkedList<>();

        System.out.print("Enter elements of stack: ");
        for (int i = 1; i <= n; i++) {
            int ele = scn.nextInt();
            stack.push(ele);
        } 

        // after increasing capacity
        // StackUsingArray stack = new StackUsingArray(2);
        // for(int i = 1 ; i <= 5 ; i++){
        //     stack.push(i);
        // }

        while(!stack.isEmpty()){
            try {
                System.out.println(stack.pop());
            } catch (StackEmptyException e) {
                // never reach here
            }
        }

    }
}
