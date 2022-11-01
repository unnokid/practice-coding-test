package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ1026 {

  public static void main(String[] args) throws IOException {
    //백준 1026 보물

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    int[] A = new int[N];
    int[] B = new int[N];
    int result = 0;
    String[] arrA = br.readLine().split(" ");
    for (int i = 0; i < N; i++) {
      A[i] = Integer.parseInt(arrA[i]);
    }
    String[] arrB = br.readLine().split(" ");
    for (int i = 0; i < N; i++) {
      B[i] = Integer.parseInt(arrB[i]);
    }
    Arrays.sort(A);
    Arrays.sort(B);

    for (int i = 0; i < N; i++) {
      result += A[i]*B[N-i-1];
    }

    System.out.println(result);
  }
}
