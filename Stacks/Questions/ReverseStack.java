package Questions;

import java.util.Stack;

public class ReverseStack {
    
    static void reverseStack(Stack<Integer> s , Stack<Integer> helper){
        if(s.size() <= 1) return;

        int lastElement = s.pop();

        // recursion also uses stack --> so we make use of recursion
        reverseStack(s,helper);

        while(!s.isEmpty()){
            int top = s.pop();
            helper.push(top);
        }

    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> helper = new Stack<>();

        int[] arr = {3,4,7,1,2};
        for(int ele : arr){
            stack.push(ele);
        }

        reverseStack(stack,helper);
        
        while(!stack.empty()){
            System.out.println(stack.pop());
        }
    }
}
