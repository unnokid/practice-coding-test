package leetcode;

import java.util.Arrays;

public class TheNumberofWeakCharactersintheGame {

  public static void main(String[] args) {
    Solution solution = new Solution();
    int[][] pro;
    pro = new int[][]{{1,5},{10,4},{4,3}};
    System.out.println(solution.numberOfWeakCharacters(pro));
    pro = new int[][]{{7,7},{1,2},{9,7},{7,3},{3,10},{9,8},{8,10},{4,3},{1,5},{1,5}};
    System.out.println(solution.numberOfWeakCharacters(pro));
  }
  static class Solution {
    public int numberOfWeakCharacters(int[][] properties) {
      int result =0;
      int max = Integer.MIN_VALUE;

      Arrays.sort(properties, (a,b) -> (a[0] != b[0]? b[0] - a[0] : a[1] - b[1]));

      for(int[] target : properties){
        if(target[1] < max){
          result++;
        }
        max = Math.max(target[1], max);
      }

      return result;
    }
  }
}
