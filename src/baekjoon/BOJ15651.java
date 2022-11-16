package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ15651 {

  static StringBuilder sb = new StringBuilder();

  public static void main(String[] args) throws IOException {
    //백준 15651 N과 M(3)

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] split = br.readLine().split(" ");

    int N = Integer.parseInt(split[0]);
    int count = Integer.parseInt(split[1]);

    int[] map = new int[N];
    for (int i = 0; i < N; i++) {
      map[i] = i + 1;
    }

    dfs(map, count, 0, new int[count]);
    System.out.println(sb);
  }

  static void dfs(int[] map, int count, int choice, int[] list) {
    if (count == choice) {
      for (int i = 0; i < list.length; i++) {
        sb.append(list[i]).append(" ");
      }
      sb.append("\n");
      return;
    }

    for (int i = 0; i < map.length; i++) {
      list[choice] = map[i];
      dfs(map, count, choice + 1, list);

    }
  }
}
