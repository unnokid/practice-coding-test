package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ5525 {

  public static void main(String[] args) throws IOException {
    //백준 5525 IOIOI
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    int M = Integer.parseInt(br.readLine());
    char[] s = br.readLine().toCharArray();

    int result = 0;
    int patternCount = 0;

    for (int i = 1; i < s.length - 1; i++) {
      if (s[i - 1] == 'I' && s[i] == 'O' && s[i+1] == 'I') {
        patternCount++;
        if (patternCount == N) {
          patternCount--;
          result++;
        }
        i++;
      } else {
        patternCount = 0;
      }
    }
    System.out.println(result);
  }
}
