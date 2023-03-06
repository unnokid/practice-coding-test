package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ12865 {

    public static void main(String[] args) throws IOException {
        //백준 12865 평범한 배낭

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");

        int N = Integer.parseInt(s[0]);
        int K = Integer.parseInt(s[1]);
        int[][] product = new int[N+1][2];
        int[][] dp = new int[N+1][K+1];
        for (int i = 1; i <= N; i++) {
            String[] temp = br.readLine().split(" ");
            product[i][0] = Integer.parseInt(temp[0]);
            product[i][1] = Integer.parseInt(temp[1]);
        }

        for (int i = 1; i <= K; i++) { // 무게
            for (int j = 1; j <= N; j++) { // 물건
                dp[j][i] = dp[j - 1][i];
                if (i - product[j][0] >= 0) {
                    //비교 무게와 물건 무게 비교
                    dp[j][i] = Math.max(dp[j - 1][i], product[j][1] + dp[j - 1][i - product[j][0]]);
                }
            }
        }

        System.out.println(dp[N][K]);
    }
}
