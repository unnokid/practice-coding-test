package leetcode;

import java.util.Stack;

public class MinimumRemovetoMakeValidParentheses {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s;
        s="lee(t(c)o)de)";
        System.out.println(solution.minRemoveToMakeValid(s));
        s="a)b(c)d";
        System.out.println(solution.minRemoveToMakeValid(s));
        s="))((";
        System.out.println(solution.minRemoveToMakeValid(s));
        s="((s((";
        System.out.println(solution.minRemoveToMakeValid(s));
    }
    static class Solution {
        public String minRemoveToMakeValid(String s) {
            //괄호문제
            //맞지않는 괄호를 제거한 문자열 return

            //괄호의 인덱스를 저장해서 짝이 이루어지지않으면 삭제
            
            StringBuilder sb = new StringBuilder();
            Stack<Integer> stack = new Stack<>();
            int target =0;
            for(char temp : s.toCharArray()){
                //여는 괄호
                if(temp =='('){
                    //위치 저장
                    stack.push(target);
                }else if(temp ==')'){
                    //닫는 괄호
                    //짝이 없는 경우
                    if(stack.isEmpty()){
                       continue;
                    }else{
                        stack.pop();
                    }
                }
                //괄호가 아니면 추가
                //문자열 추가해주기
                sb.append(temp);
                target++;
            }

            //스택에 괄호에 위치 정보가 남아있는 경우
            while(!stack.isEmpty()){
                int temp = stack.pop();
                sb.deleteCharAt(temp);
            }
            

            return sb.toString();
        }
    }
}
