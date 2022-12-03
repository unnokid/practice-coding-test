package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ14916 {

    public static void main(String[] args) throws IOException {
        //백준 14916 거스름돈

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        int[] dp = new int[100001];
        dp[1] = -1; //불가
        dp[2] = 1;  // 2원 1개
        dp[3] = -1; //불가
        dp[4] = 2;  // 2원 2개
        dp[5] = 1;  // 5원 1개

        for (int i = 6; i <=T ; i++) {
            dp[i] = Integer.MAX_VALUE;
        }

        for (int i = 6; i <=T ; i++) {
            if(dp[i-2] == -1 && dp[i-5] == -1){
                dp[i] = -1;
            }else if(dp[i-2] == -1){
                dp[i] = dp[i-5] + 1;
            }else if(dp[i-5] == -1){
                dp[i] = dp[i-2] +1;
            }else{
                dp[i] = Math.min(dp[i-2], dp[i-5]) +1;
            }
        }

        System.out.println(dp[T]);

    }
}
