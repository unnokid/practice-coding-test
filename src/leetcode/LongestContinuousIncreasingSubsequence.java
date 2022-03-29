package leetcode;

public class LongestContinuousIncreasingSubsequence {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums;
        nums = new int[]{1,3,5,4,7};
        System.out.println(solution.findLengthOfLCIS(nums));
        nums = new int[]{2,2,2,2,2};
        System.out.println(solution.findLengthOfLCIS(nums));
    }
    static class Solution {
        public int findLengthOfLCIS(int[] nums) {
            //배열이 증가하는 가장 긴 길이를 return
            int before = nums[0];
            int len =1;
            int answer =0;

            if(nums.length ==1){
                return 1;
            }

            for (int i = 1; i <nums.length; i++) {
                if(before < nums[i]){
                    len++;
                    before = nums[i];
                }else{
                    before = nums[i];
                    answer = Math.max(answer,len);
                    len =1;
                }
            }
            answer = Math.max(answer,len);
            return answer;
        }
    }
}
