package leetcode;

import java.util.Arrays;

public class MaximumScorefromPerformingMultiplicationOperations {

  public static void main(String[] args) {
    Solution solution = new Solution();
    int[] nums;
    int[] mul;
    nums = new int[]{1, 2, 3};
    mul = new int[]{3, 2, 1};
    System.out.println(solution.maximumScore(nums, mul));
    nums = new int[]{-5, -3, -3, -2, 7, 1};
    mul = new int[]{-10, -5, 3, 4, 6};
    System.out.println(solution.maximumScore(nums, mul));
  }

  static class Solution {

    public int maximumScore(int[] nums, int[] multipliers) {

      int[][] map = new int[multipliers.length + 1][multipliers.length + 1];

      //i는 multi 숫자 큰거부터
      //j는 왼쪽
      //k는 오른쪽
      for (int i = multipliers.length - 1; i >= 0; i--) {
        for (int j = i; j >= 0; j--) {
          int target = multipliers[i];
          int k = nums.length - 1 - (i - j);
          map[i][j] = Math.max(target * nums[j] + map[i + 1][j + 1],
              target * nums[k] + map[i + 1][j]);
        }
      }
      return map[0][0];
    }
  }
}
