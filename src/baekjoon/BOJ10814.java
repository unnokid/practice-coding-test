package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class BOJ10814 {

  public static void main(String[] args) throws IOException {
    //백준 10814 나이순 정렬

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());

    String[][] arr = new String[N][2];
    for (int i = 0; i < N; i++) {
      String[] s = br.readLine().split(" ");
      arr[i][0] = s[0];
      arr[i][1] = s[1];
    }

    Arrays.sort(arr, new Comparator<String[]>() {
      @Override
      public int compare(String[] o1, String[] o2) {
        if (o1[0] == o2[0]) {
          return 1;
        }else{
          return Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]);
        }
      }
    });

    for (int i = 0; i < N; i++) {
      System.out.println(arr[i][0]+" "+arr[i][1]);
    }


  }
}
