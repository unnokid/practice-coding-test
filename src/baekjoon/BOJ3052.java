package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class BOJ3052 {

  public static void main(String[] args) throws IOException {
    //백준 3052 나머지

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    Set<Integer> set = new HashSet<>();

    for (int i = 0; i <10 ; i++) {
      int X = Integer.parseInt(br.readLine());
      set.add(X%42);
    }
    System.out.println(set.size());



  }
}
