package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FindOriginalArrayFromDoubledArray {

  public static void main(String[] args) {
    Solution solution = new Solution();
    int[] changed;
    changed = new int[]{1, 3, 4, 2, 6, 8};
    System.out.println(Arrays.toString(solution.findOriginalArray(changed)));
  }

  static class Solution {

    public int[] findOriginalArray(int[] changed) {

      //짝수길이 아니면 끝
      if (changed.length % 2 != 0) {
        return new int[0];
      }
      int[] result = new int[(changed.length / 2)];
      HashMap<Integer, Integer> map = new HashMap<>();

      for (int i = 0; i < changed.length; i++) {
        map.put(changed[i], map.getOrDefault(changed[i], 0) + 1);
      }

      int idx = 0;

      Arrays.sort(changed);
      for (int i : changed) {

        if (map.get(i) <= 0) {
          //있으면 패스
          continue;
        }
        if (map.getOrDefault(2 * i, 0) <= 0) {
          return new int[0];
        }

        result[idx++] = i;
        map.put(i, map.get(i) - 1);
        map.put(2 * i, map.get(2 * i) - 1);
      }

      return result;


    }
  }
}
