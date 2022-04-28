package leetcode;

import java.util.Arrays;
import java.util.PriorityQueue;

public class PathwithMininumEffort {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] heights = new int[][]{{1,2,2},{3,8,2},{5,3,5}};
        System.out.println(solution.minimumEffortPath(heights));
    }
    static class Solution {
        public int minimumEffortPath(int[][] heights) {
            int n = heights.length;
            int m = heights[0].length;

            if(n==1&& m==1){
                return 0;
            }

            int[][] map = new int[n][m];
            for(int[] row: map){
                Arrays.fill(row,1000001);
            }

            PriorityQueue<int[]> pq = new PriorityQueue<>((t1,t2) -> (t1[2] - t2[2]));
            pq.offer(new int[]{0,0,0});
            int dir[][] = {{0,1},{0,-1},{1,0},{-1,0}};

            while(!pq.isEmpty()){
                int[] cur = pq.poll();
                int row = cur[0];
                int col = cur[1];
                int wt = cur[2];

                for(int[] target : dir){
                    int nrow = row+target[0];
                    int ncol = col+target[1];
                    if(nrow<0 || nrow>=n || ncol<0 || ncol>=m){
                        continue;
                    }
                    int nwt = Math.max(wt,Math.abs(heights[nrow][ncol] - heights[row][col]));

                    if(nwt < map[nrow][ncol]){
                        map[nrow][ncol] = nwt;
                        pq.offer(new int[]{nrow,ncol,nwt});
                    }
                }
            }
            return map[n-1][m-1];
        }

    }
}
