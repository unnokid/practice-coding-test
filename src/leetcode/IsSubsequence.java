package leetcode;

import java.util.HashMap;
import java.util.Map;

public class IsSubsequence {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s1;
        String s2;
        s1 ="abc";
        s2 ="ahbgdc";
        System.out.println(solution.isSubsequence(s1,s2));
        s1 ="axc";
        s2 ="ahbgdc";
        System.out.println(solution.isSubsequence(s1,s2));
    }
    static class Solution {
        public boolean isSubsequence(String s, String t) {
            //s으로 주어지는 문자들이 순서에 맞게 t에 모두 있는지 판단

            for (int i = 0; i <s.length() ; i++) {
                String temp = String.valueOf(s.charAt(i));
                if(t.contains(temp)){
                    //존재하면 그다음 인덱스부터 t를 다시 만들기
                    int target = t.indexOf(temp);
                    t=t.substring(target+1);
                }else{
                    //없으면 끝
                    return false;
                }
            }
            return true;

        }
    }
}
