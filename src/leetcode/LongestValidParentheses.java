package leetcode;

public class LongestValidParentheses {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s;
        s = ")()())";
        System.out.println(solution.longestValidParentheses(s));
    }
    static class Solution {
        public int longestValidParentheses(String s) {
            //올바른 괄호식중 가장 긴 길이 구하기
            int result = 0;
            int open = 0;
            int close =0;

            for (int i = 0; i <s.length() ; i++) {
                if(s.charAt(i) == '('){
                    open++;
                }else{
                    close++;
                }

                if(close > open){
                    open = 0;
                    close =0;
                }else if(close == open){
                    result = Math.max(result, open+close);
                }
            }

            open = 0;
            close =0;
            for (int i = s.length()-1; i >=0 ; i--) {
                if(s.charAt(i) == '('){
                    open++;
                }else{
                    close++;
                }

                if(close < open){
                    open = 0;
                    close =0;
                }else if(close == open){
                    result = Math.max(result, open+close);
                }
            }
            return result;
        }
    }

}
