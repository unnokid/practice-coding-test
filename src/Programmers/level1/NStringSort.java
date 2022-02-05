package Programmers.level1;

import java.util.Arrays;

public class NStringSort {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] strings;
        int n;
        strings = new String[]{"sun", "bed", "car"};
        n =1;
        System.out.println(Arrays.toString(solution.solution(strings, n)));
        strings = new String[]{"abce", "abcd", "cdx"};
        n =2;
        System.out.println(Arrays.toString(solution.solution(strings, n)));
    }
    static class Solution {
        public String[] solution(String[] strings, int n) {
            String[] answer = new String[strings.length];
            
            //문자열로 구성된 배열 줌
            //n번째 글자를 기준으로 오름차순을 하려고함
            
            //각 n번째 글자만 빼서 뭐가 더 높은지 찾고 정렬하기
            
            for (int i = 0; i < strings.length; i++) {
                answer[i] =strings[i].charAt(n)+strings[i];
            }
            Arrays.sort(answer);
            for (int i = 0; i < answer.length; i++) {
                answer[i] = answer[i].substring(1);
            }
            return answer;
        }
    }
}
