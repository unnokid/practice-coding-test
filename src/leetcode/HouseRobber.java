package leetcode;

import java.util.Arrays;

public class HouseRobber {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums;/*
        nums = new int[]{1,2,3,1};
        System.out.println(solution.rob(nums));*/
        /*nums = new int[]{2,7,9,3,1};
        System.out.println(solution.rob(nums));*/
        nums = new int[]{2,1,1,1};
        System.out.println(solution.rob(nums));
        nums = new int[]{100,1,1,100,1,1,1,100};
        System.out.println(solution.rob(nums));
        nums = new int[]{2,1,1,1,1,1,1};
        System.out.println(solution.rob(nums));
    }
    static class Solution {
        public int rob(int[] nums) {
            //도둑이 집을 털려고함
            //각 집에 있는 돈이 얼만지 줌
            //한번에 붙어있는 집을 털면 신고당함
            //한번 훔칠때 가장 많은 돈을 훔칠수 있게 return

            if(nums.length ==0){
                return 0;
            }
            if(nums.length == 1){
                return nums[0];
            }

            //첫번째 두번째 값 큰값으로 동일화
            nums[1] = Math.max(nums[0],nums[1]);

            // i-2 i-1 i 값 3개를 비교해가면서
            // i-2+i 과 i-1를 비교해서 더 큰값을 i에 넣음
            for (int i = 2; i < nums.length ; i++) {
                nums[i] = Math.max(nums[i-1],nums[i-2]+nums[i]);
            }
            
            //System.out.println(Arrays.toString(nums));
            //맨뒤에서 2칸중 가장 큰값을 result
            int result =0;
            for (int i = 0; i < 2; i++) {
                result = Math.max(result,nums[nums.length-1-i]);
            }
            return result;

        }
    }

}
