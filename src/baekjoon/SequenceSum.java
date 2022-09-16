package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SequenceSum {

  public static void main(String[] args) throws IOException {
    // 1912번 연속합

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(br.readLine());
    int[] arr = new int[t];
    int[] map = new int[t];

    StringTokenizer st = new StringTokenizer(br.readLine());
    for (int i = 0; i < t; i++) {
      arr[i] = Integer.parseInt(st.nextToken());
    }
    map[0] = arr[0];
    int max = map[0];

    for (int i = 1; i < t; i++) {
      map[i] = Math.max(map[i - 1] + arr[i], arr[i]);
      max = Math.max(map[i], max);
    }

    System.out.println(max);
  }

}
