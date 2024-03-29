package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2579 {

  public static void main(String[] args) throws IOException {
    //백준 2579 계단 오르기
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());

    int[] dp = new int[N+1];
    int[] arr = new int[N+1];

    for (int i = 1; i <=N ; i++) {
      arr[i] = Integer.parseInt(br.readLine());
    }

    if(N < 3){
      int sum =0;
      for (int i = 0; i <arr.length ; i++) {
        sum+=arr[i];
      }
      System.out.println(sum);
      return;
    }

    dp[1] = arr[1];
    dp[2] = arr[2]+ arr[1];
    dp[3] = Math.max(arr[1]+arr[3], arr[2]+arr[3]);
    for (int i = 4; i <= N ; i++) {
      dp[i] = Math.max(dp[i-3]+arr[i-1],dp[i-2])+ arr[i];
    }
    System.out.println(dp[N]);

  }

}
