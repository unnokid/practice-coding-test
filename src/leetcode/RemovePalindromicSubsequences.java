package leetcode;

public class RemovePalindromicSubsequences {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s;
        s= "ababa";
        System.out.println(solution.removePalindromeSub(s));
    }
    static class Solution {
        public int removePalindromeSub(String s) {
            //회문인지 확인 맞으면 1, 틀리면 2

            StringBuilder sb = new StringBuilder();
            sb.append(s).reverse();
            return s.equals(sb.toString()) ? 1 : 2;
        }
    }
}
