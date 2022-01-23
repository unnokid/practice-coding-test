package Programmers.level2;

import java.util.Arrays;

public class MaxMin {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s;
        s= "1 2 3 4";
        System.out.println(solution.solution(s));
        s= "-1 -2 -3 -4";
        System.out.println(solution.solution(s));
        s= "-1 -1";
        System.out.println(solution.solution(s));
    }
    static class Solution {
        public String solution(String s) {
            String answer = "";
            
            //문자열 s에 공백으로 구분된 숫자 부여
            //각 최댓값 최솟값을 찾아서 문자열 형태로 반환
            String[] temp = s.split(" ");
            int[] numbers  = new int[temp.length];
            //문자를 숫자로 변환
            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = Integer.parseInt(temp[i]);
            }
            //정렬
            Arrays.sort(numbers);
            answer+=numbers[0]+" "+numbers[numbers.length-1];
            return answer;
        }
    }
}
