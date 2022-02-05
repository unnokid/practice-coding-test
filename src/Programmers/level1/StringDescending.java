package Programmers.level1;

import java.util.Arrays;

public class StringDescending {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s;
        s = "Zbcdefg";
        System.out.println(solution.solution(s));
    }
    static class Solution {
        public String solution(String s) {
            String answer = "";

            //문자열 s에 들어오는 문자를 내림차순으로 return
            char[] ch = s.toCharArray();
            StringBuilder sb = new StringBuilder();
            Arrays.sort(ch);
            for (int i = 0; i <ch.length ; i++) {
                sb.append(ch[i]);
            }

            return sb.reverse().toString();
        }
    }
}
