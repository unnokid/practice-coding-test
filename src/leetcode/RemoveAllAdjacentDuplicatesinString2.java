package leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class RemoveAllAdjacentDuplicatesinString2 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s;
        int k;
        s = "abcd";
        k = 2;
        System.out.println(solution.removeDuplicates(s, k));
        s = "deeedbbcccbdaa";
        k = 3;
        System.out.println(solution.removeDuplicates(s, k));
    }

    static class Solution {
        public String removeDuplicates(String s, int k) {
            //앞뒤가 똑같으면 ++
            //기본값은 결국 1
            Stack<Character> stack = new Stack<>();
            Stack<Integer> countStack = new Stack<>();
            StringBuilder sb = new StringBuilder();

            for (char c : s.toCharArray()) {
                //비지않고 위에 똑같은 문자면
                if(stack.size() >0 && stack.peek() == c){
                    countStack.push(countStack.peek()+1);
                }else{
                    //문자가 다르므로 초기화
                    countStack.push(1);
                }
                stack.push(c);

                //k개가 만족했을 때
                if(countStack.peek() ==k){
                    for (int i = 0; i < k; i++) {
                        stack.pop();
                        countStack.pop();
                    }
                }
            }

            while(stack.size()>0){
                sb.append(stack.pop());
            }

            return sb.reverse().toString();
        }
    }
}
