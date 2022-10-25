package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1924 {

  public static void main(String[] args) throws IOException {
    //백준 1924 2007년

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] s = br.readLine().split(" ");

    int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};
    String[] temp = new String[]{"SUN","MON","TUE", "WED", "THU", "FRI", "SAT"};
    int M = Integer.parseInt(s[0]);
    int D = Integer.parseInt(s[1]);

    int total = 0;
    for (int i = 0; i < M-1; i++) {
      total+=days[i];
    }
    total+=D;
    System.out.println(temp[total%7]);
  }
}
