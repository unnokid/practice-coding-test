package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ11060 {
    public static void main(String[] args) throws IOException {
        //백준 11060 점프점프

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N + 1];
        int[] dp = new int[N + 1];

        //dp 배열에는 i번째까지 도달시 얼마나 걸리는 지 count
        String[] s = br.readLine().split(" ");
        for (int i = 1; i <= N; i++) {
            arr[i] = Integer.parseInt(s[i - 1]);
        }
        Arrays.fill(dp, 10000);

        //시작 지점
        dp[1] = 0;

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= arr[i]; j++) {
                //한칸 지나온 값  vs 이미 입력된 값
                if (i + j > N) {
                    break;
                }
                dp[i + j] = Math.min(dp[i] + 1, dp[i + j]);
            }
        }
        System.out.println(dp[N] == 10000 ? -1 : dp[N]);
    }
}
