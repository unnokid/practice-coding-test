package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ9095 {
  static int count;
  public static void main(String[] args) throws IOException {
    //백준 9095 1,2,3 더하기

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int T = Integer.parseInt(br.readLine());

    for (int i = 0; i < T; i++) {
      int target = Integer.parseInt(br.readLine());
      count =0;
      dfs(target,0);
      System.out.println(count);
    }
  }
  static void dfs(int n,int sum){
    if(sum > n){
      return ;
    }else if(sum == n){
      count++;
      return;
    }

    // 1 2 3 더하기

    for (int i = 1; i < 4; i++) {
      dfs(n,sum+i);
    }


  }

}
