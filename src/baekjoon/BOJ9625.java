package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ9625 {

    public static void main(String[] args) throws IOException {
        //백준 9625 BABBA

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.parseInt(br.readLine());

        int[] dp = new int[47];

        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i < 47; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        System.out.println(dp[K - 1] + " " + dp[K]);
    }
}
