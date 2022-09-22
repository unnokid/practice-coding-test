package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class BOJ1743 {
  static int count =0;
  static int[] dx = new int[]{-1,0,1,0};
  static int[] dy = new int[]{0,1,0,-1};
  public static void main(String[] args) throws IOException {
    // 백준 1743 음식물 피하기
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] split = br.readLine().split(" ");
    int N = Integer.parseInt(split[0]);
    int M = Integer.parseInt(split[1]);
    int T = Integer.parseInt(split[2]);

    int[][] map = new int[N][M];
    boolean[][] visited = new boolean[N][M];
    List<Integer> result = new ArrayList<>();
    for (int i = 0; i < T; i++) {
      String[] s = br.readLine().split(" ");
      map[Integer.parseInt(s[0])-1][Integer.parseInt(s[1])-1] = 1;
    }

    for (int i = 0; i <N ; i++) {
      for (int j = 0; j <M ; j++) {
        if(!visited[i][j] && map[i][j] == 1){
          count =0;
          dfs(map, visited,i,j);
          result.add(count);
        }
      }
    }

    int max = Integer.MIN_VALUE;
    for (int i = 0; i <result.size() ; i++) {
      max = Math.max(max, result.get(i));
    }

    System.out.println(max);
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

      if(nextX <0 || nextY <0 || nextX>=map.length || nextY >= map[0].length){
        continue;
      }
      dfs(map,visited,nextX,nextY);
    }
  }
}
