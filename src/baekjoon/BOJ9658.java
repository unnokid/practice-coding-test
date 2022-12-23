package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ9658 {

    public static void main(String[] args) throws IOException {
        //백준 9658 돌게임 4

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] dp = new int[1001];
        dp[1] = 2;
        dp[2] = 1;
        dp[3] = 2;
        dp[4] = 1;
        for (int i = 5; i <= N; i++) {
            dp[i] = 2;
            if (dp[i-1] == 2 || dp[i-3] == 2 || dp[i-4] == 2){
                dp[i] = 1;
            }
        }
        if (dp[N] == 1) {
            System.out.print("SK");
        } else {
            System.out.print("CY");
        }
    }
}
