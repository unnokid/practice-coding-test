package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ15657 {
  static StringBuilder sb = new StringBuilder();
  public static void main(String[] args) throws IOException {
    //백준 15657 N과 M(8)

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] split = br.readLine().split(" ");

    int N = Integer.parseInt(split[0]);
    int count = Integer.parseInt(split[1]);

    int[] map = new int[N];
    String[] s = br.readLine().split(" ");
    for (int i = 0; i < N; i++) {
      map[i] = Integer.parseInt(s[i]);
    }
    Arrays.sort(map);

    dfs(map, count, 0, new int[count],0);
    System.out.println(sb);
  }
  static void dfs(int[] map, int count, int choice, int[] list,int start) {
    if (count == choice) {
      for (int i = 0; i < list.length; i++) {
        sb.append(list[i]).append(" ");
      }
      sb.append("\n");
      return;
    }

    for (int i = start; i < map.length; i++) {
      list[choice] = map[i];
      dfs(map, count, choice + 1, list,i);
    }
  }
}
