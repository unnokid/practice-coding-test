package leetcode;

import java.util.Arrays;

public class FindtheDuplicateNumber {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums;
        nums = new int[]{1,3,4,2,2};
        System.out.println(solution.findDuplicate(nums));
    }
    static class Solution {
        public int findDuplicate(int[] nums) {
            //배열을 부여할때 중복이 있는 값을 출력
            //중복값은 하나만 존재함

            Arrays.sort(nums);
            int target =0;
            for (int i = 0; i <nums.length ; i++) {
                if(target == nums[i]){
                    return target;
                }
                target = nums[i];

            }
            return 0;
        }
    }
}
