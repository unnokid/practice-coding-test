package Programmers.level2;

import java.util.Arrays;

public class CutNsquare {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int n;
        long left;
        long right;
        n=3;
        left=2;
        right=5;
        System.out.println(Arrays.toString(solution.solution(n, left, right)));
        n=4;
        left=7;
        right=14;
        System.out.println(Arrays.toString(solution.solution(n, left, right)));
    }
    static class Solution {
        public int[] solution(int n, long left, long right) {
            int[] answer = {};

            answer = new int[(int) (right - left +1)];
            long[] map = new long[n];
            for (int i = 0; i <n ; i++) {
                map[i] = i+1;
            }
            //몫과 나머지로 계산한다
            long a =0;
            long b =0;
            long target =left;
            for (int i = 0; i < answer.length; i++) {
                a = target/n;
                b = target%n;
                if(b == n-1 || a == n-1){
                    answer[i] = n;
                }
                else{
                    if(a>b){
                        answer[i] =(int) (map[(int) b] +a-b);
                    }
                    else{
                        answer[i] =(int) map[(int) b];
                    }
                }
                target++;
            }


            return answer;
        }
    }
}
