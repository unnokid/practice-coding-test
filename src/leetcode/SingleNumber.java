package leetcode;

import java.util.Arrays;

public class SingleNumber {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums;
        nums = new int[] {2,2,1};
        System.out.println(solution.singleNumber(nums));
        nums = new int[] {4,1,2,1,2};
        System.out.println(solution.singleNumber(nums));
    }
    static class Solution {
        public int singleNumber(int[] nums) {

            //길이 1개면 리턴
            if (nums.length ==1){
                return nums[0];
            }

            //정렬하기
            Arrays.sort(nums);

            //정렬된 배열을 돌며 짝지어서
            for (int i = 0; i < nums.length-1; i+=2) {

                //짝지었을때 서로 다르다면 앞에가 싱글
                if(nums[i] != nums[i+1]){
                    return  nums[i];
                }
            }

            //마지막 최대 값일 경우 return
            return nums[nums.length-1];

        }
    }
}
