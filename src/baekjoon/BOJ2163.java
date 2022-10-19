package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2163 {

  public static void main(String[] args) throws IOException {
    //백준 2163 초콜릿 자르기
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] split = br.readLine().split(" ");
    int N = Integer.parseInt(split[0]);
    int M = Integer.parseInt(split[1]);

    System.out.println(M*N -1);

  }
}
