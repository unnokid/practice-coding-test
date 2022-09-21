package leetcode;

import java.util.Arrays;

public class SumofEvenNumbersAfterQueries {

  public static void main(String[] args) {
    Solution solution = new Solution();
    int[] nums;
    int[][] queries;
    nums = new int[]{1,2,3,4};
    queries = new int[][]{{1,0},{-3,1},{-4,0},{2,3}};
    System.out.println(Arrays.toString(solution.sumEvenAfterQueries(nums, queries)));
  }
  static class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {

      int[] result = new int[nums.length];
      int sum =0;
      int count =0;
      for (int i = 0; i <nums.length; i++) {
        if(nums[i] %2 ==0){
          sum+= nums[i];
        }
      }

      for (int[] q : queries){
        int value = q[0];
        int idx = q[1];

        //전 값이 짝수인가?
        if(Math.abs(nums[idx])%2 ==0){
          sum-= nums[idx];
        }

        //완성한 값이 짝수인가?
        if(Math.abs(nums[idx] + value)%2 ==0){
          sum+= nums[idx]+value;
        }
        nums[idx] += value;
        result[count] = sum;
        count++;
      }
      return result;
    }
  }
}
