package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ11052 {

    public static void main(String[] args) throws IOException {
        //백준 11052 카드 구매하기

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] pack = new int[N+1];
        String[] s = br.readLine().split(" ");
        int[] dp = new int[N+1];
        for (int i = 0; i < N; i++) {
            pack[i+1] = Integer.parseInt(s[i]);
        }
        pack[0] =0;
        //카드 팩으로만 구매 가능 1~N개 팩
        //카드 개수가 적어도 가격이 비싸면 높은 등급카드가 있을걸로 기대함
        //최대한 돈을 많이 소모해서 카드 N개를 구매하려고함

        for (int i = 1; i <=N ; i++) {
            //i개의 카드를 살때 최대로 비싸게 삼
            for (int j = 1; j <= i ; j++) {
                // 만약 4장이 목표면 1 + 3, 2 + 2 이런식으로 dp[i-j]를 적용
                dp[i] = Math.max(dp[i], pack[j] + dp[i-j]);
            }
        }
        System.out.println(dp[N]);
    }
}
