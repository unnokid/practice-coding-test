package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class ContainsDuplicate {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums;
        nums = new int[]{1,2,3,1};
        System.out.println(Arrays.toString(nums));
    }
    static class Solution {
        public boolean containsDuplicate(int[] nums) {
            //중복원소가 있으면 true, 아니면 false return
            HashSet<Integer> set = new HashSet<>();
            for (int i = 0; i <nums.length ; i++) {
                set.add(nums[i]);
            }
            return nums.length != set.size();
        }
    }
}
