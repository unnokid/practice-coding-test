package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ15650 {
  static StringBuilder sb = new StringBuilder();
  public static void main(String[] args) throws IOException {
    //백준 15650 N과M(2)

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] split = br.readLine().split(" ");

    int N = Integer.parseInt(split[0]);
    int count = Integer.parseInt(split[1]);

    int[] map = new int[N];
    boolean[] visit = new boolean[N];
    for (int i = 0; i <N ; i++) {
      map[i] = i+1;
    }

    dfs(map,visit,count,0,new int[count],0);
    System.out.println(sb);
  }
  static void dfs(int[] map, boolean[] visit,int count, int choice, int[] list, int start){
    if(count == choice){
      for (int i = 0; i <list.length ; i++) {
        sb.append(list[i]).append(" ");
      }
      sb.append("\n");
      return;
    }

    for (int i = start; i <map.length ; i++) {
      if(!visit[i]){
        list[choice] = map[i];
        visit[i] = true;
        dfs(map,visit,count,choice+1,list,i+1);
        visit[i] = false;
      }
    }
  }
}
