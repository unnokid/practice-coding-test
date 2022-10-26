package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ContinuousSubarraySum {

  public static void main(String[] args) {
    Solution solution = new Solution();
    int[] nums;
    int k;
    nums = new int[]{23, 2, 6, 4, 7};
    k = 13;
    System.out.println(solution.checkSubarraySum(nums, k));
    nums = new int[]{1, 0};
    k = 2;
    System.out.println(solution.checkSubarraySum(nums, k));
    nums = new int[]{1, 2, 12};
    k = 6;
    System.out.println(solution.checkSubarraySum(nums, k));
  }

  static class Solution {

    public boolean checkSubarraySum(int[] nums, int k) {
      // nums 배열과 k를 줌
      // nums의 부분배열(크기가 2이상)의 합이 k배수이면 true
      //아니면 false

      Map<Integer, Integer> map = new HashMap<>(Map.of(0,0));
      int sum = 0;

      for (int i = 0; i < nums.length; i++) {
        sum += nums[i];

        if (!map.containsKey(sum % k)) {
          map.put(sum % k, i + 1);
        }else if(map.get(sum%k) <i){
          return true;
        }
      }

      return false;

    }
  }
}
