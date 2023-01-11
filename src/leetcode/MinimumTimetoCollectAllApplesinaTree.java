package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MinimumTimetoCollectAllApplesinaTree {

    public static void main(String[] args) {

    }
    static class Solution {
        public int minTime(int n, int[][] edges, List<Boolean> hasApple) {

            List<List<Integer>> list = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                list.add(new ArrayList<>(0));
            }
            boolean[] visited = new boolean[n];
            for(int[] edge : edges){
                list.get(edge[0]).add(edge[1]);
                list.get(edge[1]).add(edge[0]);

            }
            return dfs(list, visited,hasApple,0);
        }
        int dfs(List<List<Integer>> list, boolean[] visited, List<Boolean> hasApple,int cur){
            int sum =0;

            visited[cur] = true;

            for (int next: list.get(cur)){
                if(!visited[next]){
                    sum += dfs(list,visited,hasApple,next);
                }
            }

            if(cur ==0){
                return sum;
            }

            return sum + ((hasApple.get(cur) || sum > 0) ? 2 : 0);
        }
    }
}
