package leetcode;

import java.util.*;

public class CombinationSum {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] candidates;
        int target;/*
        candidates = new int[]{2,3,6,7};
        target = 7;
        System.out.println(solution.combinationSum(candidates,target));
        candidates = new int[]{1,2};
        target = 1;
        System.out.println(solution.combinationSum(candidates,target));*/
        candidates = new int[]{1,2};
        target = 4;
        System.out.println(solution.combinationSum(candidates,target));
    }
    static class Solution {
        static List<List<Integer>> answer;
        public List<List<Integer>> combinationSum(int[] candidates, int target) {
            //각각 다른 원소의 integer로 이루어진 배열을 준다
            //그리고 target을 준다
            // 유니크한 조합으로 target을 만들어낼수 있으면 그 조합을
            //아니면 그냥 빈칸을 return
            Arrays.sort(candidates);
            answer = new ArrayList<>();
            plus(target,0,new ArrayList<>(),candidates);

            return answer;

        }
        static void plus(int sum,int idx  ,List<Integer> list,int[] candidates){
            //sum에 target- list요소들 한 값
            if(sum ==0){
                List<Integer> t = new ArrayList<>(list);
                answer.add(t);
                return;
            }
            else if(sum <0){
                return;
            }

            for (int i = idx; i <candidates.length ; i++) {
                list.add(candidates[i]);
                plus(sum-candidates[i],i,list,candidates);
                list.remove(list.size()-1);
            }
        }
    }
}
