package leetcode;

import java.util.ArrayList;
import java.util.List;

public class AllPathsFromSourcetoTarget {

    public static void main(String[] args) {

    }
    static class Solution {
        public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
            List<List<Integer>> result = new ArrayList<>();

            if(graph.length ==0 || graph[0].length ==0){
                return result;
            }

            List<Integer> list= new ArrayList<>();
            list.add(0);
            dfs(graph,result,list,0);

            return result;
        }
        static void dfs(int[][] map, List<List<Integer>> result, List<Integer> list, int idx){
            if(idx == map.length-1){
                result.add(new ArrayList<>(list));
                return;
            }

            for (int next: map[idx]){
                list.add(next);
                dfs(map,result,list,next);
                list.remove(list.size()-1);
            }


        }
    }
}
