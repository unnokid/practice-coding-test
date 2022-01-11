package leetcode;

import java.util.Arrays;

public class PermutationInString {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s1;
        String s2;
        /*s1 ="ab";
        s2 ="eidbaooo";
        System.out.println(solution.checkInclusion(s1,s2));
        s1 ="ab";
        s2 ="eidboaoo";
        System.out.println(solution.checkInclusion(s1,s2));*/
        s1 ="adc";
        s2 ="dcda";
        System.out.println(solution.checkInclusion(s1,s2));
    }
    static class Solution {
        public boolean checkInclusion(String s1, String s2) {

            int[] a = new int[26];
            for (int i = 0; i <s1.length() ; i++) {
                a[s1.charAt(i)-97]++;
            }
            int length = s1.length();
            for (int i = 0; i <= s2.length() -s1.length() ; i++) {
                int[] b = new int[26];
                for (int j = i; j < i+length; j++) {
                    b[s2.charAt(j)-97]++;
                }
                //System.out.println("a는 "+Arrays.toString(a));
                //System.out.println("b는 "+Arrays.toString(b));
                if(Arrays.equals(a, b)){
                    return true;
                }
            }
            return false;
        }
    }

}
