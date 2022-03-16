package leetcode;

import java.util.Stack;

public class ValidateStackSequences {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] pushed;
        int[] poped;
        pushed = new int[]{1,2,3,4,5};
        poped = new int[]{4,5,3,2,1};
        System.out.println(solution.validateStackSequences(pushed,poped));
        pushed = new int[]{1,2,3,4,5};
        poped = new int[]{4,3,5,1,2};
        System.out.println(solution.validateStackSequences(pushed,poped));
        pushed = new int[]{2,1,0};
        poped = new int[]{1,2,0};
        System.out.println(solution.validateStackSequences(pushed,poped));
    }
    static class Solution {
        public boolean validateStackSequences(int[] pushed, int[] popped) {
            //2개의 정수 배열을 줌
            //각각 유니크한 요소임
            //푸시 배열과 팝 배열의 순서가 맞게 동작할 수 있는지의 여부

            Stack<Integer> stack = new Stack<>();

            //순서대로 넣고 popped에서 뺄수있는지 or 더 뺄 수 있는지
            int idx =0;
            for (int i = 0; i <pushed.length ; i++) {
                stack.push(pushed[i]);

                //비어있지 않고
                while(!stack.isEmpty() && idx < popped.length && stack.peek() == popped[idx]){
                    stack.pop();
                    idx++;
                }
            }
            
            //idx가 popped 끝까지 가면 다 빠진거임
            
            return idx == popped.length;
        }
    }
}
