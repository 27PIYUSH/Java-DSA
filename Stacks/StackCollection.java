import java.util.Stack;

public class StackCollection {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        
        int[] arr = {4,6,8,7,5,3,12};
        for (int i = 0; i < arr.length; i++) {
            stack.push(arr[i]);
        }

        System.out.println("Top element: "+stack.peek());

        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }

    }
    
}
