package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class BOJ1302 {

  public static void main(String[] args) throws IOException {
    //백준 1302 베스트셀러


    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());

    Map<String,Integer> map = new HashMap<>();
    for (int i = 0; i < N; i++) {
      String target = br.readLine();

      map.put(target,map.getOrDefault(target,0)+1);
    }

    int val = 0;
    String ans = "";
    for(String key : map.keySet()) {
      if(val == map.get(key)) {
        if(ans.compareTo(key) > 0) {
          ans = key;
        }
      }else if(val < map.get(key)) {
        val = map.get(key);
        ans = key;
      }

    }
    System.out.println(ans);
  }
}
