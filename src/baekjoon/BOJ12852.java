package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ12852 {
    public static void main(String[] args) throws IOException {
        //백준 12852 1로 만들기 2
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] dp = new int[N + 1];
        int[] count = new int[N + 1];


        dp[1] = 0;
        for (int i = 2; i <= N; i++) {
            //기본값으로 1더하기
            dp[i] = dp[i - 1] + 1;
            count[i] = i - 1;

            if (i % 3 == 0 && dp[i / 3] + 1 < dp[i]) {
                //3으로 나누어지는 경우
                dp[i] = dp[i / 3] + 1;
                count[i] = i / 3;
            }

            if (i % 2 == 0 && dp[i / 2] + 1 < dp[i]) {
                //2로 나누어지는 경우
                dp[i] = dp[i / 2] + 1;
                count[i] = i / 2;
            }
        }

        StringBuilder sb=  new StringBuilder();
        //n까지의 연산 횟수
        System.out.println(dp[N]);
        while(N>0){
            sb.append(N).append(" ");
            N = count[N];
        }
        System.out.println(sb);
    }
}
