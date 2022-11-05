package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1449 {

  public static void main(String[] args) throws IOException {
    //백준 1449 수리공 항승

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] split = br.readLine().split(" ");

    int N = Integer.parseInt(split[0]);
    int L = Integer.parseInt(split[1]);

    boolean[] visit = new boolean[1001];
    int count = 0;
    String[] w = br.readLine().split(" ");

    for (int i = 0; i < w.length; i++) {
      visit[Integer.parseInt(w[i])] = true;
    }

    for (int i = 0; i < visit.length; i++) {
      if(visit[i]){
        for (int j = i; j < L+i; j++) {
          if(j >1000){
            break;
          }
          visit[j] = false;
        }
        count++;
      }
    }

    System.out.println(count);
  }
}
