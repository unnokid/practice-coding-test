package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permutations2 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] num;
        num = new int[]{1,1,2};
        System.out.println(solution.permuteUnique(num));
    }
    static class Solution {
        List<List<Integer>> list;
        public List<List<Integer>> permuteUnique(int[] nums) {
            list = new ArrayList<>();
            boolean[] visit = new boolean[nums.length];
            Arrays.sort(nums);
            check(nums, new ArrayList<>(),visit);
            return list;
        }
        private void check(int[] nums, List<Integer> temp, boolean[] visit){
            if(temp.size() == nums.length){
                list.add(new ArrayList<>(temp));
            }

            for (int i = 0; i <nums.length ; i++) {
                if(visit[i] || (i >0 && nums[i -1] == nums[i] && !visit[i-1])){
                    continue;
                }

                temp.add(nums[i]);
                visit[i] = true;
                check(nums,temp,visit);
                visit[i] = false;
                temp.remove(temp.size()-1);
            }
        }
    }

}
