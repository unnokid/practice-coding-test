package leetcode;

import java.util.Locale;

public class DetectCapital {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s;
        s="USA";
        System.out.println(solution.detectCapitalUse(s));
        s="leetcode";
        System.out.println(solution.detectCapitalUse(s));
        s="Google";
        System.out.println(solution.detectCapitalUse(s));
        s="FlaG";
        System.out.println(solution.detectCapitalUse(s));
        s="g";
        System.out.println(solution.detectCapitalUse(s));
    }
    static class Solution {
        public boolean detectCapitalUse(String word) {
            //1. 모든 글자가 대문자
            //2. 모든 글자가 다 대문자가 아닌경우
            //3. 첫글자만 대문자인경우
            //3가지 경우는 true


            String temp1 = word.toUpperCase();
            String temp2 = word.toLowerCase();
            String temp3 = word.substring(0,1).toUpperCase()+word.substring(1).toLowerCase();
            return temp1.equals(word) || temp2.equals(word) || temp3.equals(word);
        }
    }
}
