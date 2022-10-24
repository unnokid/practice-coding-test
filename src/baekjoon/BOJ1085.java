package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1085 {

  public static void main(String[] args) throws IOException {
    //백준 1085 직사각형에서 탈출
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] M = br.readLine().split(" ");

    int x = Integer.parseInt(M[0]);
    int y = Integer.parseInt(M[1]);
    int w = Integer.parseInt(M[2]);
    int h = Integer.parseInt(M[3]);

    System.out.println(Math.min(Math.min(x,y),Math.min(w-x,h-y)));
  }
}
