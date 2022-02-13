package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Subsets {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums;
        nums = new int[]{1,2,3};
        System.out.println(solution.subsets(nums));
    }
    static class Solution {
        public List<List<Integer>> subsets(int[] nums) {
            //배열이 주어질때 이 배열의 부분집합으로 만들 수 있는 모든 경우를
            //리스트 배열로 return
            List<List<Integer>> list = new ArrayList<>();
            dfs(nums,list,new ArrayList<>(),0);
            return list;


        }
        public void dfs(int[] nums,List<List<Integer>> list, List<Integer> temp, int start ){
            //temp 은 빈 배열
            list.add(new ArrayList<>(temp));

            for (int i = start; i < nums.length; i++) {
                //temp에 순서대로 채우고 list에 더한후 맨마지막에 temp 추가했던 원소 제거
                temp.add(nums[i]);
                dfs(nums,list,temp,i+1);
                temp.remove(temp.size()-1);
            }
        }

    }

}
