package leetcode;

import java.util.Arrays;

public class LargestPerimeterTriangle {

  public static void main(String[] args) {

  }
  static class Solution {
    public int largestPerimeter(int[] nums) {
      //세변중 가장 긴변이 나머지 두변합보다 작아야함
      //가장 큰 세변의 길이 return
      Arrays.sort(nums);
      for (int i = nums.length-1; i >=2 ; i--) {
        if(nums[i] < nums[i-1]+nums[i-2]){
          return nums[i] + nums[i-1]+nums[i-2];
        }
      }
      return 0;
    }
  }
}
