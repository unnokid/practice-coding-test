package leetcode;

import java.util.Arrays;

public class KthLargestElementinanArray {

  public static void main(String[] args) {
    Solution solution = new Solution();
    int[] nums;
    int k;
    nums = new int[]{3,2,1,5,6,4};
    k =2;
    System.out.println(solution.findKthLargest(nums,k));
  }
  static class Solution {
    public int findKthLargest(int[] nums, int k) {
      //배열중 k번째로 큰 숫자 구하기
      Arrays.sort(nums);
      return nums[nums.length-k];
    }
  }

}
