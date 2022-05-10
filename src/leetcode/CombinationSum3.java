package leetcode;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum3 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int k;
        int n;
        k=3;
        n=7;
        System.out.println(solution.combinationSum3(k,n));
    }
    static class Solution {
        List<List<Integer>> map;
        List<Integer> list;
        public List<List<Integer>> combinationSum3(int k, int n) {
            //합은 n, 개수는 k
            map = new ArrayList<>();
            list = new ArrayList<>();
            check(k,n,1);
            return map;
        }
        private void check(int k, int n, int start){
            if(k ==0 && n == 0){
                map.add(new ArrayList<>(list));
                return;
            }

            for (int i = start; i <10 ; i++) {
                list.add(i);
                check(k-1,n-i,i+1);
                list.remove(list.size()-1);
            }
        }
    }

}
