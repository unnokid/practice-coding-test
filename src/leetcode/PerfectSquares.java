package leetcode;

import java.util.Arrays;

public class PerfectSquares {

    public static void main(String[] args) {
        Solution solution = new Solution();

    }
    static class Solution {
        public int numSquares(int n) {

            //n을 줄때
            //제곱수의 합으로 표현 가능할때 제곱수의 개수를 return
            int answer = 0;

            int[] dp = new int[n+1];
            Arrays.fill(dp,n);
            dp[0] = 0;
            for (int i = 0; i <n+1 ; i++) {
                for (int j = 1; j <i+1 ; j++) {
                    int target = j*j;
                    if(i-target <0){
                        break;
                    }else{
                        dp[i] = Math.min(dp[i], 1+dp[i-target]);
                    }
                }
            }
            return dp[n];
        }
    }
}
