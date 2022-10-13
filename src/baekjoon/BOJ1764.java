package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class BOJ1764 {

  public static void main(String[] args) throws IOException {
     //백준 1764 듣보잡
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] s = br.readLine().split(" ");
    int M = Integer.parseInt(s[0]);
    int N = Integer.parseInt(s[1]);

    Set<String> set = new HashSet<>();
    List<String> result = new ArrayList<>();
    for (int i = 0; i <M ; i++) {
      String temp = br.readLine();
      set.add(temp);
    }
    for (int i = 0; i <N ; i++) {
      String temp = br.readLine();
      if(!set.contains(temp)){
        set.add(temp);
      }else{
        result.add(temp);
      }
    }

    Collections.sort(result);
    System.out.println(result.size());
    for (int i = 0; i <result.size() ; i++) {
      System.out.println(result.get(i));
    }
  }
}
