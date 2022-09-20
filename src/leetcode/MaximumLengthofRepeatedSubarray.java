package leetcode;

public class MaximumLengthofRepeatedSubarray {

  public static void main(String[] args) {
    Solution solution = new Solution();
    int[] nums1;
    int[] nums2;

    nums1 = new int[]{1,2,3,2,1};
    nums2 = new int[]{3,2,1,4,7};
    System.out.println(solution.findLength(nums1,nums2));

  }
  static class Solution {
    public int findLength(int[] nums1, int[] nums2) {
      int[][] map = new int[nums1.length+1][nums2.length+1];

      int result =0;

      for (int i = 1; i <map.length ; i++) {
        for (int j = 1; j <map[0].length ; j++) {
          if(nums1[i-1] == nums2[j-1]){
            map[i][j] = 1+ map[i-1][j-1];
          }
          result = Math.max(result,map[i][j]);
        }
      }
      return result;
    }
  }
}
