package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ1015 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());


    int[] result = new int[N];
    int[] arr = new int[N];
    int[] order = new int[N];
    boolean[] visit = new boolean[N];
    String[] s = br.readLine().split(" ");
    for (int i = 0; i <s.length ; i++) {
      arr[i] = Integer.parseInt(s[i]);
      order[i] = Integer.parseInt(s[i]);
    }
    Arrays.sort(order);

    for (int i = 0; i <arr.length ; i++) {
      for (int j = 0; j <order.length ; j++) {
        if(order[j] == arr[i] && !visit[j]){
          visit[j] = true;
          result[i] =j;
          break;
        }
      }
    }

    for (int i = 0; i < result.length; i++) {
      System.out.print(result[i]+" ");
    }
  }
}
