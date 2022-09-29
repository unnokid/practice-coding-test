package leetcode;

import java.util.ArrayList;
import java.util.List;
import leetcode.Matrix01.Pair;

public class findClosestElements {

  public static void main(String[] args) {
    Solution solution = new Solution();
    int[] arr;
    int k;
    int x;
    arr = new int[]{1, 2, 3, 4, 5};
    k = 4;
    x = 3;
    System.out.println(solution.findClosestElements(arr, k, x));
  }

  static class Solution {

    public List<Integer> findClosestElements(int[] arr, int k, int x) {
      List<Integer> result = new ArrayList<>();

      int start = 0;
      int end = arr.length - 1;

      while (start <= end && end - start + 1 > k) {
        int a = Math.abs(arr[start] - x);
        int b = Math.abs(arr[end] - x);

        if (a > b) {
          start++;
        } else {
          end--;
        }
      }

      for (int i = start; i <= end; i++) {
        result.add(arr[i]);
      }

      return result;
    }

  }
}