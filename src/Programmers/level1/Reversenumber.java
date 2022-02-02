package Programmers.level1;

import java.util.Arrays;

public class Reversenumber {
    public static void main(String[] args) {
        Solution solution = new Solution();
        long n;
        n=12345;
        System.out.println(Arrays.toString(solution.solution(n)));
    }
    static class Solution {
        public int[] solution(long n) {
            int[] answer = {};
            //자연수 n을 뒤집어서 각 자리가 가리키는 원소를 배열로 바꿔서 return

            String s = String.valueOf(n);
            answer = new int[s.length()];
            for (int i = 0; i <answer.length; i++) {
                answer[i] =(int) (n%10);
                n/=10;
            }

            return answer;
        }
    }
}
