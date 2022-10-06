package Programmers.level0;

import java.util.Arrays;

public class MakeTwoArray {

  public static void main(String[] args) {
    Solution solution = new Solution();
    int[] num;
    int n;
    num = new int[]{1,2,3,4,5,6,7,8};
    n =2;
    System.out.println(Arrays.deepToString(solution.solution(num, n)));
  }
  static class Solution {
    public int[][] solution(int[] num_list, int n) {
      int[][] answer = new int[num_list.length/n][n];

      for (int i = 0; i <num_list.length/n ; i++) {
        for (int j = 0; j <n ; j++) {
          System.out.println(Arrays.deepToString(answer));
          answer[i][j] = num_list[i*n+j];
        }
        System.out.println(Arrays.deepToString(answer));
      }

      return answer;
    }
  }
}
