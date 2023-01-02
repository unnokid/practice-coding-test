package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ25418 {

    public static void main(String[] args) throws IOException {
        //백준 25418 정수 a를 k로 만들기

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");

        int A = Integer.parseInt(s[0]);
        int K = Integer.parseInt(s[1]);

        int[] dp = new int[K+1];
        Arrays.fill(dp, 1000001);
        dp[A] = 0;
        for (int i = A+1; i <K+1 ; i++) {
            dp[i] = dp[i-1];
            if(i%2 ==0 && dp[i] > dp[i/2]){
                dp[i] = dp[i/2];
            }
            dp[i]++;
        }
        System.out.println(dp[K]);
    }
}
