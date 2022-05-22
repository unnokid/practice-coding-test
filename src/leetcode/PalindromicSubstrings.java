package leetcode;

public class PalindromicSubstrings {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s;
        s="abc";
        System.out.println(solution.countSubstrings(s));
        s="aaa";
        System.out.println(solution.countSubstrings(s));
        s="aba";
        System.out.println(solution.countSubstrings(s));
        s="fdsklf";
        System.out.println(solution.countSubstrings(s));
    }
    static class Solution {
        public int countSubstrings(String s) {
            int result = 0;

            for(int i = 0; i < s.length(); i++) {
                result += check(s, i, i);
                if (i < s.length() - 1 && s.charAt(i) == s.charAt(i + 1)) {
                    result += check(s, i, i + 1);
                }
            }
            return result;
        }
        public int check(String str, int leftPointer, int rightPointer) {
            int count = 0;
            while(leftPointer >= 0 && rightPointer < str.length() &&
                    str.charAt(leftPointer) == str.charAt(rightPointer)) {
                count++;
                leftPointer--;
                rightPointer++;
            }

            return count;
        }
    }
}
