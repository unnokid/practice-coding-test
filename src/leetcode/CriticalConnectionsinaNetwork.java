package leetcode;

import java.util.*;

public class CriticalConnectionsinaNetwork {
    public static void main(String[] args) {
        Solution solution = new Solution();
        List<List<Integer>> map;
    }
    static class Solution {
        public List<List<Integer>> criticalConnections(int n, List<List<Integer>> connections) {
            List<List<Integer>> result = new ArrayList<>();
            Map<Integer,List<Integer>> map = new HashMap<>();
            int[] count = new int[n];
            boolean[] visit = new boolean[n];
            for (int i = 0; i < n; i++) {
                //map에선 번호에 따라 갈수있는 경로 설정
                map.putIfAbsent(i, new ArrayList<>());
            }
            for(List<Integer> list: connections){
                //추가한 부분에 connections 데이터 넣기(갈수있는 경로)
                map.get(list.get(0)).add(list.get(1));
                map.get(list.get(1)).add(list.get(0));
            }

            dfs(0,-1,0,count,map,visit,result);


            return result;
        }

        private int dfs(int target, int before, int r, int[] count, Map<Integer, List<Integer>> map, boolean[] visit, List<List<Integer>> result) {
            count[target] = r;
            visit[target] = true;

            for(int next: map.get(target)){
                if(next == before){
                    //전에 지나온 길이면 continue
                    continue;
                }

                if(!visit[next]){
                    //지나오지 않은길이면
                    int nextCount = dfs(next,target,r+1,count,map,visit,result);
                    count[target] = Math.min(count[target],nextCount);
                }else{
                    count[target] = Math.min(count[target],count[next]);
                }
            }

            if(count[target] >= r){
                if(before >=0){
                    result.add(Arrays.asList(target,before));
                }
            }
            return count[target];
        }
    }
}
