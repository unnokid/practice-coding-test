package leetcode;

import java.util.Stack;

public class RemoveAllAdjacentDuplicatesInString {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s;
        s= "abbaca";
        System.out.println(solution.removeDuplicates(s));
        s= "azxxzy";
        System.out.println(solution.removeDuplicates(s));
    }
    static class Solution {
        public String removeDuplicates(String s) {
            //인접한 중복 문자가 있으면 삭제
            Stack<Character> stack = new Stack<>();

            for(char ch : s.toCharArray()){
                if(!stack.isEmpty() && stack.peek() == ch){
                    //존재하고 같으면
                    stack.pop();
                }else{
                    stack.push(ch);
                }
            }
            StringBuilder sb = new StringBuilder();
            for(char ch : stack){
                sb.append(ch);
            }
            return sb.toString();
        }
    }
}
