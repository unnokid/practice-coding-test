package leetcode;

import java.util.ArrayList;
import java.util.List;

public class PossibleBipartition {

    public static void main(String[] args) {

    }
    static class Solution {
        public boolean possibleBipartition(int n, int[][] dislikes) {

            int[][] map = new int[n][n];
            int[] check = new int[n];
            for(int next[] : dislikes){
                map[next[0] -1][next[1] -1] =1;
                map[next[1] -1][next[0] -1] =1;
            }

            for (int i = 0; i <n ; i++) {
                if(!dfs(map,i,check,1)){
                    return false;
                }
            }
            return true;
        }
        boolean dfs(int[][] map, int cur, int[] check, int count){
            if(check[cur] !=0){
                return true;
            }
            check[cur] = count;

            for (int i = 0; i <map.length ; i++) {
                if(map[cur][i] ==1){
                    if(check[i] == count){
                        return false;
                    }
                    if(! dfs(map,i,check,-count)){
                        return false;
                    }
                }
            }
            return true;
        }

    }
}
