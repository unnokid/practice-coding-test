package leetcode;

import java.util.*;

public class Sum3 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums;
        nums = new int[]{-1,0,1,2,-1,-4};
        System.out.println(solution.threeSum(nums));
        nums = new int[]{0,0,0,0};
        System.out.println(solution.threeSum(nums));
        nums = new int[]{-2,0,1,1,2};
        System.out.println(solution.threeSum(nums));
        nums = new int[]{-1,0,1,2,-1,-4,-2,-3,3,0,4};
        System.out.println(solution.threeSum(nums));
        nums = new int[]{-1,0,1,0};
        System.out.println(solution.threeSum(nums));
    }
    static class Solution {
        public List<List<Integer>> threeSum(int[] nums) {

            //아직 다 못품
            List<List<Integer>> result = new ArrayList<>();
            Arrays.sort(nums);
            if(nums.length < 3){
                return new ArrayList<>();
            }


            //System.out.println(Arrays.toString(nums));
            for (int i = 0; i < nums.length -2 ; i++) {
                int target = nums[i];
                //System.out.println("골라진 i"+ target);


                int start =0;
                int end =nums.length-1;
                if(i==0){
                    start = 1;
                }
                else if(i == end){
                    end = nums.length-2;
                }
                else{
                    while(start < end){
                        /*System.out.println("현재 찾고있는값");
                        System.out.println(nums[start]);
                        System.out.println(nums[end]);
                        System.out.println(nums[i]);*/
                        if(nums[start]+nums[end]+nums[i] <0){
                            start++;
                        }
                        else if(nums[start]+nums[end]+nums[i] >0){
                            end--;
                        }
                        else{
                            //System.out.println("이건들어갈수있음");
                            result.add(Arrays.asList(nums[i],nums[start],nums[end]));

                            //같은값이면 앞전진
                            while(start < end && nums[start] == nums[start+1]){
                                start++;
                            }
                            //같은값이면 뒤로전진
                            while(start < end && nums[end] == nums[end-1]){
                                end--;
                            }
                            start++;
                            end--;

                        }
                    }
                }

            }
            return result;
        }
    }
}
