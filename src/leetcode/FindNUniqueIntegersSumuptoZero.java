package leetcode;

import java.util.Arrays;

public class FindNUniqueIntegersSumuptoZero {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int n;
        n= 5;
        System.out.println(Arrays.toString(solution.sumZero(n)));
        n= 7;
        System.out.println(Arrays.toString(solution.sumZero(n)));
        n= 6;
        System.out.println(Arrays.toString(solution.sumZero(n)));
    }
    static class Solution {
        public int[] sumZero(int n) {
            //n개의 덧셈으로 0이 될 수 있는 대칭 배열의 결과를 return

            int[] answer = new int[n];
            int num =-n/2;

            for (int i = 0; i < n; i++) {
                if(n%2==0 && i == n/2){
                    num++;
                }
                answer[i] = num;
                num++;

            }
            return answer;

        }
    }
}
