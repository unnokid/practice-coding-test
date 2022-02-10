package leetcode;

import java.util.Arrays;

public class SubarraySumEqualsK {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums;
        int k;
        nums = new int[]{1,1,1};
        k=2;
        System.out.println(solution.subarraySum(nums,k));
        nums = new int[]{1,2,3};
        k=3;
        System.out.println(solution.subarraySum(nums,k));
    }
    static class Solution {
        public int subarraySum(int[] nums, int k) {

            //배열 과 k를 줌
            //배열 부분중에서 연속적인 부분배열의 합이 k인 전체 개수를 return

            //연속되어있는 부분이니 k수만큼 잘라서 k인지 확인하기
            int answer =0;
            int[] temp = new int[nums.length];
            int sum =0;
            for (int i = 0; i < nums.length; i++) {
                sum+=nums[i];
                temp[i] = sum;
            }
            for (int i = nums.length -1; i >0; i--) {
                if(temp[i] == k){
                    answer++;
                }
                for (int j = i-1; j >=0 ; j--) {
                    if(temp[i]-temp[j] == k){
                        answer++;
                    }
                }
            }
            if(temp[0] == k){
                answer++;
            }


            return answer;
        }
    }
}
