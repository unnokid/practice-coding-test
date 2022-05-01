package leetcode;

import java.util.Stack;

public class BackspaceStringCompare {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s;
        String t;
        s = "ab#c";
        t = "ad#c";
        System.out.println(solution.backspaceCompare(s, t));
    }

    static class Solution {
        public boolean backspaceCompare(String s, String t) {
            //#이 나오면 앞에 문자 생략가능

            return checking(s).equals(checking(t));
        }

        public String checking(String s) {
            Stack<Character> stack = new Stack<>();
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) != '#') {
                    stack.push(s.charAt(i));
                } else if (!stack.empty()) {
                    stack.pop();
                }
            }
            return String.valueOf(stack);

        }
    }
}