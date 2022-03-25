package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums;
        nums = new int[]{1,2,3};
        System.out.println(solution.permute(nums));
    }
    static class Solution {
        public List<List<Integer>> permute(int[] nums) {
            //nums으로 만들어진 모든집합의 종류 List으로 만들기
            List<List<Integer>> list = new ArrayList<>();
            dfs(list,nums, new ArrayList<>());
            return list;
        }
        void dfs(List<List<Integer>> answer, int[] nums, List<Integer> list){
            if(list.size() == nums.length){
                answer.add(new ArrayList<>(list));
                return;
            }

            for (int i = 0; i <nums.length ; i++) {
                if(!list.contains(nums[i])){
                    list.add(nums[i]);
                    dfs(answer,nums,list);
                    list.remove(list.size()-1);
                }
            }
        }
    }
}
