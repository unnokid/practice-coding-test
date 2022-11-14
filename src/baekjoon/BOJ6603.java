package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ6603 {

  public static void main(String[] args) throws IOException {
    //백준 6603 로또

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


    while(true){
      String[] s = br.readLine().split(" ");

      if(s.length == 1){
        break;
      }

      int N = Integer.parseInt(s[0]);
      int[] map = new int[s.length-1];
      for (int i = 0; i <map.length ; i++) {
        map[i] = Integer.parseInt(s[i+1]);
      }
      Arrays.sort(map);

      dfs(map,0,new int[6], new boolean[s.length-1],0);

      System.out.println();
    }

  }
  static void dfs(int[] map, int count,int[] list, boolean[] visit, int max){
    if(count == 6){

      for (int i = 0; i <list.length ; i++) {
        System.out.print(list[i]+" ");
      }
      System.out.println();
      //출력 끝
      return;
    }

    for (int i = max; i < visit.length ; i++) {
      if(!visit[i]){
        visit[i] = true;
        list[count] = map[i];
        max = Math.max(max,i);
        dfs(map,count+1,list, visit, max);
        visit[i] = false;
      }
    }
  }
}
