package leetcode;

import java.util.Arrays;

public class ArithmeticSlices {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums;
        nums = new int[]{1,2,3,4};
        System.out.println(solution.numberOfArithmeticSlices(nums));
        nums = new int[]{1,3,5,7,9};
        System.out.println(solution.numberOfArithmeticSlices(nums));
        nums = new int[]{3,-1,-5,-9};
        System.out.println(solution.numberOfArithmeticSlices(nums));
        nums = new int[]{1};
        System.out.println(solution.numberOfArithmeticSlices(nums));
        nums = new int[]{1,2,3};
        System.out.println(solution.numberOfArithmeticSlices(nums));
        nums = new int[]{1,2,3,8,9,10};
        System.out.println(solution.numberOfArithmeticSlices(nums));
    }
    static class Solution {
        public int numberOfArithmeticSlices(int[] nums) {

            if(nums.length <=2){
                return 0;
            }


            int[] distance = new int[nums.length-1];
            int answer = 0;
            int start = 0;
            int count =1;
            for (int i = 0; i <nums.length -1 ; i++) {
                distance[i] = nums[i+1] - nums[i];
            }
            start = distance[0];

            for (int i = 1; i <distance.length ; i++) {
                if(start == distance[i]){
                    count++;
                }else{
                    if(count>=2){
                        for (int j = count -1; j >=0 ; j--) {
                            answer+=j;
                        }
                    }
                    count =1;
                    start= distance[i];
                }
            }

            if(count>=2){
                for (int j = count -1; j >=0 ; j--) {
                    answer+=j;
                }
            }

            return answer;
        }
    }
}
