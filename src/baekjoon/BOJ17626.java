package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ17626 {
  static int[] map;
  static int min;
  public static void main(String[] args) throws IOException {
    //백준 17626번 Four Squares
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());

    map = new int[N+1];
    map[0] = 0;
    map[1] = 1;
    check(N);

    System.out.println(map[N]);
  }
  static void check(int n){

    for (int i = 2; i <=n ; i++) {
      int min = Integer.MAX_VALUE;
      for (int j = 1; j*j <= i ; j++) {
        min = Math.min(min, map[i-j*j]);
      }
      map[i] = min +1;
    }
  }
}
