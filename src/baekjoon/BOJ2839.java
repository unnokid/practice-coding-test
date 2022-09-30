package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2839 {

  public static void main(String[] args) throws IOException {
    //백준 2839 설탕 배달
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N= Integer.parseInt(br.readLine());

    int[] dp = new int[N+1];

    if(N >= 3){
      dp[3] = 1;
    }
    if(N >= 5){
      dp[5] = 1;
    }

    for (int i = 6; i <= N; i++) {
      if(i%5 == 0){
        //5의 배수라면
        dp[i] = dp[i-5] +1;
      }else if(i%3 == 0){
        //3의 배수라면
        dp[i] = dp[i-3] +1;
      }else{
        //아무것도 아니라면
        if(dp[i-3] !=0 && dp[i-5] !=0){
          //앞에 담은 개수가 있는지
          dp[i] = Math.min(dp[i-3],dp[i-5])+1;
        }
      }
    }

    //만들수가 없는 조합
    if(dp[N] == 0){
      System.out.println(-1);
      return ;
    }
    System.out.println(dp[N]);

  }

}
