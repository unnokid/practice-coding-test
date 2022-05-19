package leetcode;

public class LongestIncreasingPathinaMatrix {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] matrix;
        matrix = new int[][]{{9, 9, 4}, {6, 6, 8}, {2, 1, 1}};
        System.out.println(solution.longestIncreasingPath(matrix));
    }

    static class Solution {
        private static int[][] dirs = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        public int longestIncreasingPath(int[][] matrix) {
            //상하좌우 이동가능
            int result = 0;
            int[][] map = new int[matrix.length][matrix[0].length];
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[0].length; j++) {
                    result = Math.max(dfs(matrix, i, j,map), result);
                }
            }
            return result;
        }

        private int dfs(int[][] matrix, int i, int j, int[][] map) {
            if (map[i][j] != 0) return map[i][j];
            for (int[] d : dirs) {
                int x = i + d[0], y = j + d[1];
                if (0 <= x && x < matrix.length && 0 <= y && y < matrix[0].length && matrix[x][y] > matrix[i][j]){
                    map[i][j] = Math.max(map[i][j], dfs(matrix, x, y, map));
                }
            }
            return ++map[i][j];
        }
    }
}
