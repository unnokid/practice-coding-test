package leetcode;

import java.util.Arrays;

public class SortArrayByParity {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums;
        nums = new int[]{3,1,2,4};
        System.out.println(solution.sortArrayByParity(nums));
    }
    static class Solution {
        public int[] sortArrayByParity(int[] nums) {
            //정렬시 짝수가 앞으로
            int[] result = new int[nums.length];
            int count = 0;
            for (int i = 0; i <nums.length ; i++) {
                if(nums[i]%2==0){
                    result[count++] = nums[i];
                }
            }

            for (int i = 0; i <nums.length ; i++) {
                if(nums[i]%2==1){
                    result[count++] = nums[i];
                }
            }
            return result;
        }
    }

}
