package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ14501 {

  public static void main(String[] args) throws IOException {
    //백준 14501 퇴사

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());

    int[] T = new int[N+1];
    int[] P = new int[N+1];

    for (int i = 1; i <= N; i++) {
      String[] s = br.readLine().split(" ");
      T[i] = Integer.parseInt(s[0]);
      P[i] = Integer.parseInt(s[1]);
    }

    int[] dp = new int[N + 1];
    dp[0] = 0;
    int answer = dp[0];

    for (int i = 1; i <= N ; i++) {
      if(i + T[i] <= N+1){
        //선택한 날이 퇴사전까지 끝낼 수 있는가
        for (int j = 0; j < i; j++) {
          if(j+ T[j] <= i){
            // j날 상담시 i날 가능한가
            dp[i] = Math.max(dp[i], dp[j] + P[i]);
          }
        }
        answer = Math.max(answer,dp[i]);
      }
    }
    System.out.println(answer);
  }
}
