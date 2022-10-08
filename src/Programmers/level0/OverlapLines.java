package Programmers.level0;

import java.util.Arrays;

public class OverlapLines {

  public static void main(String[] args) {
    Solution solution = new Solution();
    int[][] lines;
    lines = new int[][]{{3,9},{0,5},{1,10}};
    System.out.println(solution.solution(lines));
  }
  static class Solution {
    public int solution(int[][] lines) {
      int answer = 0;
      int[] map = new int[201];

      for (int i = 0; i <lines.length ; i++) {
        int start = Math.min(lines[i][0],lines[i][1]);
        int end = Math.max(lines[i][0],lines[i][1]);
        for (int j = start; j <=end ; j++) {
          map[j+100]++;
        }
      }

      for (int i = 0; i <map.length ; i++) {
        if(map[i]>1){
          answer++;
        }
      }

      return answer;
    }
  }
}
