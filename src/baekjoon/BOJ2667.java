package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BOJ2667 {
  static int count =0;
  static int[] dx = new int[]{-1,0,1,0};
  static int[] dy = new int[]{0,1,0,-1};
  public static void main(String[] args) throws IOException {
    // 백준 2667 단지 번호 붙이기
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int T = Integer.parseInt(br.readLine());
    List<Integer> result = new ArrayList<>();
    int[][] map = new int[T][T];
    boolean[][] visited = new boolean[T][T];
    for (int i = 0; i <T ; i++) {
      String[] split = br.readLine().split("");
      for (int j = 0; j < T; j++) {
        map[i][j] = Integer.parseInt(split[j]);
      }
    }

    //dfs 전체 순회
    for (int i = 0; i <T ; i++) {
      for (int j = 0; j <T ; j++) {
        if(map[i][j] == 1 && !visited[i][j]){
          count = 0;
          dfs(map,visited,i,j);
          result.add(count);
        }
      }
    }
    System.out.println(result.size());
    Collections.sort(result);
    for (int target : result){
      System.out.println(target);
    }
  }
  static void dfs(int[][] map, boolean[][] visited, int i, int j){
    if(visited[i][j] || map[i][j] == 0){
      return ;
    }
    visited[i][j] = true;
    count++;
    for (int k = 0; k < 4; k++) {
      int nextX = i + dx[k];
      int nextY = j + dy[k];

      if(nextX <0 || nextY <0 || nextX>=map.length || nextY >= map.length){
        continue;
      }
      dfs(map,visited,nextX,nextY);
    }
  }
}
