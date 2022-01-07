package leetcode;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SquaresOfSortedArray {
    public static void main(String[] args) {

        Solution solution = new Solution();
        int[] nums;
        nums = new int[]{-4,-1,0,3,10};
        System.out.println(Arrays.toString(solution.sortedSquares(nums)));

    }


    static class Solution {
        public int[] sortedSquares(int[] nums) {

            for (int i = 0; i <nums.length ; i++) {
                nums[i] = nums[i]* nums[i];
            }

            Arrays.sort(nums);

            return nums;
        }
    }
}
