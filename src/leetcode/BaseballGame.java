package leetcode;

import java.util.Stack;

public class BaseballGame {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] op;
        op = new String[]{"5","2","C","D","+"};
        System.out.println(solution.calPoints(op));
    }
    static class Solution {
        public int calPoints(String[] ops) {

            //스택사용
            Stack<Integer> stack = new Stack<>();
            int sum =0;
            for(String op : ops){
                if(op.equals("+")){
                    int before1 = stack.pop();
                    int before2 = stack.peek();
                    int total = before1+before2;
                    sum+=total;

                    stack.push(before1);
                    stack.push(total);
                }else if(op.equals("C")){
                    sum-=stack.pop();
                }
                else if(op.equals("D")){
                    sum+=stack.peek()*2;
                    stack.push(stack.peek()*2);
                }
                else{
                        stack.push(Integer.parseInt(op));
                        sum+=stack.peek();
                    }
                }


            return sum;

        }
    }
}
