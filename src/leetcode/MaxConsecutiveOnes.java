package leetcode;

public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums;
        nums = new int[]{1,1,0,1,1,1};
        System.out.println(solution.findMaxConsecutiveOnes(nums));
    }
    static class Solution {
        public int findMaxConsecutiveOnes(int[] nums) {
            //배열이 주어질때 1이 반복되는 최대 횟수를 return

            int answer =0;
            int count =0;
            for (int i = 0; i <nums.length ; i++) {
                if(nums[i] ==1){
                    count++;
                }else{
                    answer = Math.max(answer,count);
                    count=0;
                }
            }
            answer = Math.max(answer,count);


            return answer;
        }
    }
}
