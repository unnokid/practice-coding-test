package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Combinations {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int n;
        int k;
        n=13;
        k=13;
        System.out.println(solution.combine(n,k));
    }
    static public class Solution {
        public List<List<Integer>> combine(int n, int k) {
            List<List<Integer>> result = new ArrayList<>();

            backtrack(result,1, new ArrayList<Integer>(),n,k);

            return result;
        }
        public void backtrack(List<List<Integer>> result,int target,List<Integer> temp, int n, int k){

            //정해진 개수 골랐을때 새로만들어서 result에 넣기
            if(temp.size() == k){
                List<Integer> list = new ArrayList<>(temp);
                result.add(list);
            }

            //고르는 숫자 1~n
            for (int i = target; i <= n ; i++) {
                //target을 증가시키며 넣고 백트래킹돌리고 다시 맨마지막에 제거
                temp.add(i);
                System.out.println(temp+"temp추가후");
                backtrack(result,i+1,temp,n,k);
                temp.remove(temp.size()-1);
                System.out.println(temp+"temp제거후");
            }
        }
    }

}
