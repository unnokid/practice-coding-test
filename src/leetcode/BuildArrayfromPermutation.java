package leetcode;

import java.util.Arrays;

public class BuildArrayfromPermutation {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums;
        nums = new int[]{0,2,1,5,3,4};
        System.out.println(Arrays.toString(solution.buildArray(nums)));
    }
    static class Solution {
        public int[] buildArray(int[] nums) {
            //배열안에 있는 값이 인덱스값이 되어서 다시 저장


            for (int i = 0; i < nums.length ; i++) {
                nums[i] += nums.length * (nums[nums[i]] %nums.length);
            }

            for (int i = 0; i <nums.length ; i++) {
                nums[i]/= nums.length;
            }

            return nums;
        }
    }
}
