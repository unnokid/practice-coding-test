package leetcode;

import java.util.Stack;

public class EvaluateReversePolishNotation {

    public static void main(String[] args) {

    }

    static class Solution {
        public int evalRPN(String[] tokens) {
            Stack<Integer> stack = new Stack<>();

            for (int i = 0; i <tokens.length; i++) {
                if(tokens[i].equals("+")){
                    int a = stack.pop();
                    int b = stack.pop();
                    stack.push(b+a);
                }else if(tokens[i].equals("-")){
                    int a = stack.pop();
                    int b = stack.pop();
                    stack.push(b-a);
                }else if(tokens[i].equals("*")){
                    int a = stack.pop();
                    int b = stack.pop();
                    stack.push(b*a);
                }else if(tokens[i].equals("/")){
                    int a = stack.pop();
                    int b = stack.pop();
                    stack.push(b/a);
                }else{
                    stack.push(Integer.valueOf(tokens[i]));
                }
            }

            return stack.pop();
        }
    }


}
