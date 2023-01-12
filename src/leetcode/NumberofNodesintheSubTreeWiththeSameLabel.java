package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class NumberofNodesintheSubTreeWiththeSameLabel {

    public static void main(String[] args) {

    }
    static class Solution {

        public int[] countSubTrees(int n, int[][] edges, String labels) {
            int[] result = new int[n];
            int[] ch = new int[26];

            List<Integer>[] list = new ArrayList[n];
            for(int i = 0; i < n; i++){
                list[i] = new ArrayList<>();
            }

            for(int[] edge : edges){
                list[edge[0]].add(edge[1]);
                list[edge[1]].add(edge[0]);
            }
            dfs(result, list, labels, 0, 0, ch);


            return result;
        }
        public int[] dfs(int[] result, List<Integer>[] list, String labels, int node, int parent, int[] ch){
            int[] currCount = new int[26];

            if(list[node].size() == 0){
                ch[labels.charAt(node) - 'a']++;
                result[node] = 1;
                return ch;
            }
            for(int child : list[node]){
                if(child == parent){
                    continue;
                }
                int[] childCount = dfs(result, list, labels, child, node, ch);
                for(int i = 0; i < 26; i++){
                    currCount[i] += childCount[i];
                }
            }
            currCount[labels.charAt(node) - 'a']++;
            result[node] = currCount[labels.charAt(node) - 'a'];
            return currCount;
        }
    }

}
