package leetcode;

import java.util.Arrays;

public class MaxNumberofKSumPairs {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums;
        int k;
        nums = new int[]{1,2,3,4};
        k=5;
        System.out.println(solution.maxOperations(nums,k));
    }
    static class Solution {
        public int maxOperations(int[] nums, int k) {
            //정렬후 최소+최소 = 목표 k이면 제거
            int answer =0;
            Arrays.sort(nums);
            int left = 0;
            int right = nums.length-1;
            while(left<right){
                if(nums[left] + nums[right] < k){
                    left++;
                }else if(nums[left] + nums[right] > k){
                    right--;
                }else{
                    answer++;
                    left++;
                    right--;
                }
            }
            return answer;
        }
    }
}
