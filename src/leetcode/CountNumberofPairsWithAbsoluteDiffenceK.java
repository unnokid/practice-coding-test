package leetcode;

import java.util.HashMap;
import java.util.HashSet;

public class CountNumberofPairsWithAbsoluteDiffenceK {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums;
        int k;
        nums = new int[]{1,2,2,1};
        k =1;
        System.out.println(solution.countKDifference(nums,k));
    }
    static class Solution {
        public int countKDifference(int[] nums, int k) {

            int answer =0;
            for (int i = 0; i < nums.length-1 ; i++) {
                for (int j = i; j <nums.length ; j++) {
                    if(Math.abs(nums[i] - nums[j]) == k){
                        answer++;
                    }
                }
            }


            return answer;
        }
    }
}
