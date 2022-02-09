package leetcode;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int nums[];
        int target;
        nums = new int[]{2,7,11,15};
        target = 9;
        System.out.println(Arrays.toString(solution.twoSum(nums, target)));
        nums = new int[]{3,2,4};
        target = 6;
        System.out.println(Arrays.toString(solution.twoSum(nums, target)));
    }
    static class Solution {
        public int[] twoSum(int[] nums, int target) {
            int[] answer = new int[2];
            HashMap<Integer,Integer> map = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                map.put(nums[i],i);
            }

            for (int i = 0; i <nums.length ; i++) {
                int temp = target - nums[i];
                if(map.containsKey(temp)){
                    //같은자리 겹치면 끝
                    int t = map.get(temp);
                    if(i == t){
                        continue;
                    }
                    answer[0] = i;
                    answer[1] = t;
                    break;
                }
            }
            return answer;
        }
    }
}
