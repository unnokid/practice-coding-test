package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2293 {
    public static void main(String[] args) throws IOException {
        //백준 2293 동전 1

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int N = Integer.parseInt(s[0]);
        int K = Integer.parseInt(s[1]);

        int[] arr = new int[N+1];
        int[] dp = new int[100001];
        dp[0] = 1;
        for (int i = 1; i <= N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        for (int i = 1; i <=N ; i++) {
            for (int j = arr[i]; j <=K ; j++) {
                dp[j] = dp[j] + dp[j-arr[i]];
            }
        }

        System.out.println(dp[K]);
    }
}
