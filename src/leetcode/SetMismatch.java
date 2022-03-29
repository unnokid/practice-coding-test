package leetcode;

import java.util.Arrays;

public class SetMismatch {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums;
        nums= new int[]{1,2,2,4};
        System.out.println(Arrays.toString(solution.findErrorNums(nums)));
        nums= new int[]{1,1};
        System.out.println(Arrays.toString(solution.findErrorNums(nums)));
        nums= new int[]{2,2};
        System.out.println(Arrays.toString(solution.findErrorNums(nums)));
    }
    static class Solution {
        public int[] findErrorNums(int[] nums) {
            //배열을줄때 중복된 배열의값, 없는값을 return

            int[] answer = new int[2];
            boolean[] check = new boolean[nums.length+1];
            check[0] = true;
            for (int i = 0; i <nums.length ; i++) {
                if(!check[nums[i]]){
                    check[nums[i]] = true;
                }else{
                    answer[0] = nums[i];
                }
            }
            for (int i = 1; i <check.length ; i++) {
                if(!check[i]){
                    answer[1] = i;
                    break;
                }
            }
            return answer;
        }
    }
}
