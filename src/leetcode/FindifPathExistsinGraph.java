package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindifPathExistsinGraph {

    public static void main(String[] args) {

    }
    static class Solution {
        boolean pass =false;
        public boolean validPath(int n, int[][] edges, int source, int destination) {
            ArrayList<ArrayList<Integer>> map = new ArrayList<>();
            for(int i=0;i<n;i++){
                map.add(new ArrayList<>());
            }
            for(int i=0;i<edges.length;i++){
                map.get(edges[i][0]).add(edges[i][1]);
                map.get(edges[i][1]).add(edges[i][0]);
            }
            boolean[] vis = new boolean[n];
            dfs(map,source,destination,vis);
            return pass;
        }
        public void dfs(ArrayList<ArrayList<Integer>> graph,int start,int end,boolean[] vis){
            if(start==end||pass==true){
                pass = true;
                return;
            }
            if(vis[start]){
                return;
            }
            vis[start]=true;
            for(int x:graph.get(start)){
                if(!vis[x]){
                    dfs(graph,x,end,vis);
                }
            }
        }

    }
}
