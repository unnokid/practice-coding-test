package leetcode;

public class JumpGame {

    public static void main(String[] args) {

    }
    static class Solution {
        public boolean canJump(int[] nums) {

            int target = nums.length-1;
            int cur = 0;

            for (int i = 0; i <nums.length ; i++) {
                if(i > cur){
                    return false;
                }
                cur = Math.max(cur,i+nums[i]);
            }
            return true;

        }
    }
}
