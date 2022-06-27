package baekjoon;

import java.util.Scanner;

public class organicCabbage {

  static int[][] map;
  static boolean[][] visit;
  static int[] dx = {0, 0, -1, 1};
  static int[] dy = {-1, 1, 0, 0};
  static int w;
  static int h;
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int t = scanner.nextInt();
    int n = 0;
    int count = 0;
    //배추에 대한 값 입력
    //테스트 케이스 개수, 가로 세로 길이, 배추 심어진 좌표 개수
    for (int i = 0; i < t; i++) {
      w = scanner.nextInt();
      h = scanner.nextInt();
      n = scanner.nextInt();
      map = new int[w][h];
      visit = new boolean[w][h];
      count = 0;

      //배추 좌표 입력
      for (int j = 0; j < n; j++) {
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        map[a][b] = 1;
      }

      //지렁이 개수 세기
      for (int j = 0; j < w; j++) {
        for (int k = 0; k < h; k++) {
          if (map[j][k] == 1 && !visit[j][k]) {
            count++;
            dfs(j, k);
          }
        }
      }

    }
  }

  static void dfs(int x, int y) {
    //진입 체크
    visit[x][y] = true;

    for (int i = 0; i < 4; i++) {
      int newX = x + dx[i];
      int newY = y + dy[i];

      //좌표 기준 벗어나는지 상하좌우 체크
      if(newX>=0 && newY>=0 && newX < w && newY <h){
        //좌표 기준에 만족함
        if(map[newX][newY] ==1 && !visit[newX][newY]){
          //이동한 좌표에 배추가 존재하고 방문한적이없으면 이동
          dfs(newX,newY);
        }
      }
    }
  }


}
