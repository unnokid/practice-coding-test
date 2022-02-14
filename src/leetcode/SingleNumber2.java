package leetcode;

import java.util.HashMap;
import java.util.HashSet;

public class SingleNumber2 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums;
        nums = new int[]{2,2,3,2};
        System.out.println(solution.singleNumber(nums));
    }
    static class Solution {
        public int singleNumber(int[] nums) {
            HashMap<Integer,Integer> map = new HashMap<>();
            int answer = 0;
            for (int i = 0; i <nums.length ; i++) {
                if(map.containsKey(nums[i])){
                    map.put(nums[i],2);

                }else{
                    map.put(nums[i],1);
                }
            }
            for (int key : map.keySet()){
                if(map.get(key) == 1){
                    answer = key;
                    break;
                }
            }
            return answer;
        }
    }
}
