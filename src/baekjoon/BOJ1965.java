package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1965 {
    public static void main(String[] args) throws IOException {
        //백준 1965 상자넣기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        int[] arr = new int[T];
        int[] dp = new int[T];
        String[] s = br.readLine().split(" ");

        int result = Integer.MIN_VALUE;
        for (int i = 0; i < T; i++) {
            arr[i] = Integer.parseInt(s[i]);
            dp[i] = 1;
        }

        for (int i = 1; i < T; i++) {
            for (int j = 0; j < i; j++) {
                if(arr[i] > arr[j]){
                    dp[i] = Math.max(dp[i],dp[j]+1);
                }
            }
            result = Math.max(dp[i], result);
        }
        System.out.println(result);

    }
}
