package Programmers.level1;

import java.util.Arrays;

public class NnumberxDistance {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int x;
        int n;
        x=2;
        n=5;
        System.out.println(Arrays.toString(solution.solution(x, n)));
        x=4;
        n=3;
        System.out.println(Arrays.toString(solution.solution(x, n)));
        x=-4;
        n=2;
        System.out.println(Arrays.toString(solution.solution(x, n)));
    }
    static class Solution {
        public long[] solution(long x, int n) {
            long[] answer = {};

            //정수 x와 자연수 n을 받아
            //x부터 시작해 x씩 증가하는 숫자 n개를 지니는 리스트를 return
            //ex x=2 n=5 이면 2부터 시작해서 2씩 증가하는 배열 만들기
            // [2,4,6,8,10]

            //제한 조건때문에 long으로 고침
            answer = new long[n];
            for (int i = 0; i < n; i++) {
                answer[i] = x*(i+1);
            }
            return answer;
        }
    }
}
