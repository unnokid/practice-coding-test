package leetcode;

import java.util.Arrays;

public class FindtheDifference {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s;
        String t;
        s ="abcd";
        t ="abcde";
        System.out.println(solution.findTheDifference(s,t));
        s ="a";
        t ="aa";
        System.out.println(solution.findTheDifference(s,t));
    }
    static class Solution {
        public char findTheDifference(String s, String t) {
            //2개의 String을 줌
            //t는 s를 랜덤으로 섞은뒤 임의의 위치에 한개 문자를 더 추가해서 만듬

            int[] letter = new int[26];

            //길이가 1이면 그냥 바로 끝
            if(s.length() ==0){
                return t.charAt(0);
            }

            //t문자열 알파벳 세기
            for (int i = 0; i <t.length() ; i++) {
                int target = t.charAt(i)-97;
                letter[target]++;
            }

            //s문자열 알파벳 세기
            for (int i = 0; i <s.length() ; i++) {
                int target = s.charAt(i) - 97;
                letter[target]--;
            }
            // 알파벳 남은거 return
            for (int i = 0; i <letter.length ; i++) {
                if(letter[i] == 1){
                    return (char) (i+97);
                }
            }
            System.out.println(Arrays.toString(letter));

            //x나오면 오류
            return 'x';
        }
    }
}
