package Questions;

import java.util.Scanner;
import java.util.Stack;

public class BalancedParenthesis {
    
    public static boolean isBalanced(String s){
        Stack<Character> stack = new Stack<>();
        for(int  i = 0 ; i<s.length(); i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '['){
                stack.push(s.charAt(i));
            }
            else if(s.charAt(i) == ')'){
                if(stack.peek() == '(') {
                    stack.pop();
                }
                else{
                    return false;
                }
            }
            else if(s.charAt(i) == '}'){
                if(stack.peek() == '{') {
                    stack.pop();
                }
                else{
                    return false;
                }
            }
            else if(s.charAt(i) == ']'){
                if(stack.peek() == '[') {
                    stack.pop();
                }
                else{
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Parenthesis: ");
        String s = scn.next();
        System.out.println(isBalanced(s));
    }
}
