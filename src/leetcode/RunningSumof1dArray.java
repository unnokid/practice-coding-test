package leetcode;

public class RunningSumof1dArray {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums;
        nums = new int[]{1,2,3,4};
        System.out.println(solution.runningSum(nums));
    }
    static class Solution {
        public int[] runningSum(int[] nums) {
            //배열을 줄때 값의 덧셈이 축적된값을 만들기
            int sum =0;
            for (int i = 0; i <nums.length ; i++) {
                sum+=nums[i];
                nums[i] = sum;
            }
            return nums;
        }
    }
}
