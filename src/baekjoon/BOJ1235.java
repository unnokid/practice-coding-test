package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class BOJ1235 {

  public static void main(String[] args) throws IOException {
     //백준 1235 학생 번호

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());

    String[] list = new String[N];
    for (int i = 0; i < N; i++) {
      list[i] = br.readLine();
    }
    int len = list[0].length();

    for (int i = 1; i <len ; i++) {
      //번호 길이
      //int div = (int) Math.pow(10,i);
      Set<String> set = new HashSet<>();
      for (int j = 0; j <N ; j++) {
        set.add(list[j].substring(len-i));
      }

      if(set.size() == N){
        System.out.println(i);
        return;
      }
    }
    System.out.println(len);
  }
}
