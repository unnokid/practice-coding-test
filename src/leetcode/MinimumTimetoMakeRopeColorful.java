package leetcode;

public class MinimumTimetoMakeRopeColorful {

  public static void main(String[] args) {

  }
  static class Solution {
    public int minCost(String colors, int[] neededTime) {

      int result = 0;
      int left = 0;
      int right =0;

      while (left < neededTime.length && right < neededTime.length) {
        int cur = 0, total = 0;
        while (right < neededTime.length && colors.charAt(left) == colors.charAt(right)) {
          cur += neededTime[right];
          total = Math.max(total, neededTime[right]);
          right++;
        }

        result += cur - total;
        left = right;
      }
      return result;
    }
  }
}
