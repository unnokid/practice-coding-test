package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1389 {

  public static void main(String[] args) throws IOException {
    //백준 1389 케빈 베이컨의 6단계 법칙
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] NM = br.readLine().split(" ");
    int N = Integer.parseInt(NM[0]);
    int M = Integer.parseInt(NM[1]);
    int result = 1000;
    int max = Integer.MAX_VALUE;
    int[][] map = new int[N][N];
    for (int i = 0; i <N ; i++) {
      for (int j = 0; j <N ; j++) {
        if(i == j){
          continue;
        }
        map[i][j] = 1000000;
      }
    }
    for (int i = 0; i <M ; i++) {
      String[] temp = br.readLine().split(" ");
      int start = Integer.parseInt(temp[0])-1;
      int end = Integer.parseInt(temp[1]) -1;
      int distance = 1;
      map[start][end] = Math.min(map[start][end], distance);
      map[end][start] = Math.min(map[end][start], distance);
    }

    for (int k = 0; k < N; k++) {
      for (int i = 0; i < N; i++) {
        for (int j = 0; j < N; j++) {
          map[i][j] = Math.min(map[i][j], map[i][k]+map[k][j]);
        }
      }
    }

    for (int i = N-1; i >=0 ; i--) {
      int sum =0;
      for (int j = 0; j <N ; j++) {
        sum+=map[i][j];
      }
      if(sum <= max){
        max = sum;
        result = i+1;
      }
    }
    System.out.println(result);
  }

}
