package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ11659 {

  public static void main(String[] args) throws IOException {
    //백준 11659 구간 합 구하기 4
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] s = br.readLine().split(" ");
    int N = Integer.parseInt(s[0]);
    int T = Integer.parseInt(s[1]);

    int[] map = new int[N];
    String[] arr = br.readLine().split(" ");
    for (int i = 0; i <arr.length ; i++) {
      map[i] = Integer.parseInt(arr[i]);
    }

    //다 더해놓기
    for (int i = 1; i <map.length ; i++) {
      map[i] += map[i-1];
    }
    for (int i = 0; i <T ; i++) {
      String[] target = br.readLine().split(" ");
      int before = Integer.parseInt(target[0]);
      int after = Integer.parseInt(target[1]);
      if(before ==1){
        System.out.println(map[after-1]);
      }else{
        System.out.println((map[after-1]-map[before-2]));
      }

    }


  }
}
