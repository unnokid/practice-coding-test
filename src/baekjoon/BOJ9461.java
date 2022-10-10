package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ9461 {

  public static void main(String[] args) throws IOException {

    //백준 9461 파도반 수열
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int T = Integer.parseInt(br.readLine());
    long[] map = new long[101];
    map[1] = 1;
    map[2] =1;
    map[3] =1;
    for (int i = 4; i <=100 ; i++) {
      map[i] = map[i-3]+map[i-2];
    }
    for (int i = 0; i < T; i++) {
      int target = Integer.parseInt(br.readLine());
      System.out.println(map[target]);
    }

  }
}
