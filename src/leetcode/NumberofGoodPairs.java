package leetcode;

import java.util.HashMap;
import java.util.Map;

public class NumberofGoodPairs {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums;
        nums = new int[]{1,2,3,1,1,3};
        System.out.println(solution.numIdenticalPairs(nums));
    }
    static class Solution {
        public int numIdenticalPairs(int[] nums) {
            int answer=0;
            //같은 숫자끼리 인덱스를 짝지을수 있으면 그 경우를 모두 세서 return

            Map<Integer,Integer> map = new HashMap<>();

            for (int i = 0; i <nums.length ; i++) {
                if(map.containsKey(nums[i])){
                    map.put(nums[i],map.get(nums[i])+1);
                }
                else{
                    map.put(nums[i],1);
                }
            }

            for(int key : map.values()){
                for (int i = 1; i < key; i++) {
                    answer+=i;
                }
            }

            return answer;
        }
    }
}
