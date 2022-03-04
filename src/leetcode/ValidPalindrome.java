package leetcode;

public class ValidPalindrome {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s;
        s="A man, a plan, a canal: Panama";
        System.out.println(solution.isPalindrome(s));
        s="race a car";
        System.out.println(solution.isPalindrome(s));
        s=" ";
        System.out.println(solution.isPalindrome(s));
    }
    static class Solution {
        public boolean isPalindrome(String s) {
            String temp = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
            System.out.println(temp);

            for (int i = 0; i <temp.length()/2 ; i++) {
                if(temp.charAt(i) != temp.charAt(temp.length()-i-1)){
                    return false;
                }
            }
            return true;
        }
    }
}
