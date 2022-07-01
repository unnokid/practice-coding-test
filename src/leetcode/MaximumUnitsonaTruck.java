package leetcode;

import java.util.Arrays;

public class MaximumUnitsonaTruck {

  public static void main(String[] args) {
    Solution solution = new Solution();
    int[][] boxTypes;
    int truckSize;
    boxTypes = new int[][]{{1, 3}, {2, 2}, {3, 1}};
    truckSize = 4;
    System.out.println(solution.maximumUnits(boxTypes, truckSize));
  }
  static class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
      //무게순으로 정렬
      Arrays.sort(boxTypes, (a, b) -> b[1] - a[1]);
      int result = 0;
      for (int[] b : boxTypes) {
        int count = Math.min(b[0], truckSize);
        result += count * b[1];
        truckSize -= count;
        if (truckSize == 0) {
          return result;
        }
      }
      return result;
    }
  }

}
