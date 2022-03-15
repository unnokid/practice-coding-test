package leetcode;

import java.util.Arrays;

public class MinimumPathSum {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] grid;
        grid = new int[][] {{1,3,1},{1,5,1},{4,2,1}};
        System.out.println(solution.minPathSum(grid));
        grid = new int[][] {{1,2,3},{4,5,6}};
        System.out.println(solution.minPathSum(grid));
    }
    static class Solution {
        public int minPathSum(int[][] grid) {
            // m x n 표를 줌
            //오른쪽과 아래로 가며 가장 작은 덧셈으로 끝까지 갈수 있는 경로 값 return

            int m = grid.length;
            int n = grid[0].length;

            for (int i = 1; i < m ; i++) {
                grid[i][0] += grid[i-1][0];
            }
            for (int i = 1; i <n; i++) {
                grid[0][i] += grid[0][i-1];
            }
            System.out.println(Arrays.deepToString(grid));
            for (int i = 1; i <m ; i++) {
                for (int j = 1; j <n ; j++) {
                    grid[i][j] += Math.min(grid[i-1][j],grid[i][j-1]);
                }
            }

            return grid[m-1][n-1];
        }
    }
}
