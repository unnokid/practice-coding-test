package Programmers.level0;

public class SafeZone {

  public static void main(String[] args) {
    Solution solution = new Solution();
    int[][] board;
    board = new int[][]{{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 1, 0, 0}, {0, 0, 0, 0, 0}};
    System.out.println(solution.solution(board));
  }
  static class Solution {
    public int solution(int[][] board) {
      int answer = 0;
      boolean[][] map = new boolean[board.length][board[0].length];
      int[] dx = new int[]{-1,-1,-1,0,0,0,1,1,1};
      int[] dy = new int[]{-1,0,1,-1,0,1,-1,0,1};
      for (int i = 0; i <board.length ; i++) {
        for (int j = 0; j <board[0].length ; j++) {
          if (board[i][j] == 1){
            for (int k = 0; k <dx.length ; k++) {
              int nextX = i + dx[k];
              int nextY = j + dy[k];
              if(nextX <0 || nextX >=map.length || nextY<0 || nextY>=map.length){
                continue;
              }
              map[nextX][nextY] = true;
            }
          }
        }
      }
      for (int i = 0; i <map.length ; i++) {
        for (int j = 0; j <map[0].length ; j++) {
          if(!map[i][j]){
            answer++;
          }
        }
      }

      return answer;
    }
  }
}
