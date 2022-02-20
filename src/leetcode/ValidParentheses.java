package leetcode;

import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s;
        s="()";
        System.out.println(solution.isValid(s));
        s="()[]{}";
        System.out.println(solution.isValid(s));
        s="(]";
        System.out.println(solution.isValid(s));
    }
    static class Solution {
        public boolean isValid(String s) {
            Stack<Character> stack = new Stack<>();

            for (int i = 0; i <s.length() ; i++) {
                char c= s.charAt(i);
                char end;

                //시작은 스택에 넣음
                if(c =='(' || c == '{' || c == '['){
                    stack.push(c);
                }else{
                    //시작 괄호가 아니면 stack에서 가져오기
                    if(!stack.isEmpty()){
                        end = stack.pop();
                    }else{
                        return false;
                    }
                    //꺼내온 값과 짝이 틀린지 확인
                    if((c == ')' && end !='(')||
                       (c == '}' && end !='{')||
                       (c == ']' && end !='[')){
                        return false;
                    }

                }

            }
            //나머지 스택이 비어있으면 짝이 다맞음
            return stack.isEmpty();
        }
    }
}
