package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1562 {
    static int N;
    static long[][][] dp;
    static final int MOD = 1000000000;
    public static void main(String[] args) throws IOException {
        //백준 15622 계단수

        //비트마스킹에 대한 이해가 부족해서 참고해서 풀이했음
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        dp = new long[N+1][10][1 << 10];

        for (int i = 1; i <= 9; i++) {
            dp[1][i][1 << i] = 1;
        }

        for (int n = 2; n <= N; n++) {
            for (int k = 0; k <= 9; k++) {
                for (int visit = 0; visit < (1 << 10); visit++) {

                    int newVisit = visit | (1 << k);

                    if (k == 0)
                        dp[n][k][newVisit] += dp[n - 1][k + 1][visit] % MOD;
                    else if (k == 9)
                        dp[n][k][newVisit] += dp[n - 1][k - 1][visit] % MOD;
                    else
                        dp[n][k][newVisit] += dp[n - 1][k + 1][visit] % MOD + dp[n - 1][k - 1][visit] % MOD;

                    dp[n][k][newVisit] %= MOD;
                }
            }
        }

        long sum = 0;
        for (int i = 0; i <= 9; i++) {
            sum += dp[N][i][(1 << 10) - 1] % MOD;
            sum %= MOD;
        }

        System.out.println(sum);
    }
}
