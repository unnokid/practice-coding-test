package leetcode;

import java.util.Arrays;

public class ValidAnagram {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s;
        String t;
        s ="anagram";
        t ="nagaram";
        System.out.println(solution.isAnagram(s,t));
    }
    static class Solution {
        public boolean isAnagram(String s, String t) {

            //2개의 문자열을 줄때
            //두 문자열의 관계가 anagram인지를 확인해서 return
            //anagram이란 단어요소를 재배열해서 같게 만들수있는지 대한 여부

            if(s.length() != t.length()){
                return false;
            }
            int[] target = new int[26];
            int[] patten = new int[26];

            for (int i = 0; i < t.length(); i++) {
                target[s.charAt(i)-97]++;
                patten[t.charAt(i)-97]++;
            }
            return Arrays.equals(target,patten) ? true : false;

        }
    }
}
