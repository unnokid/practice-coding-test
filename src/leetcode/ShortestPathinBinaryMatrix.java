package leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class ShortestPathinBinaryMatrix {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] grid;
        grid = new int[][]{{0, 1}, {1, 0}};
        System.out.println(solution.shortestPathBinaryMatrix(grid));
    }

    static class Solution {
        public int shortestPathBinaryMatrix(int[][] grid) {
            int result = 0;

            if (grid == null || grid.length == 0 || grid[0].length == 0) {
                return -1;
            }

            if (grid[0][0] == 1 || grid[grid.length - 1][grid[0].length - 1] == 1) {
                return -1;
            }

            Queue<int[]> queue = new LinkedList<>();
            int[][] dirs = new int[][]{{-1, -1}, {-1, 0}, {-1, 1}, {0, -1}, {0, 1}, {1, -1}, {1, 0}, {1, 1}};
            boolean[][] visit = new boolean[grid.length][grid[0].length];


            queue.offer(new int[]{0, 0});
            visit[0][0] = true;

            while (!queue.isEmpty()) {
                int count = queue.size();
                result++;

                for (int i = 0; i < count; i++) {
                    int[] target = queue.poll();

                    if (target[0] == grid.length - 1 && target[1] == grid[0].length - 1) {
                        return result;
                    }

                    for (int[] dir : dirs) {
                        int nextX = target[0] + dir[0];
                        int nextY = target[1] + dir[1];

                        if (nextX < 0 || nextX >= grid.length || nextY < 0 || nextY >= grid[0].length || visit[nextX][nextY] || grid[nextX][nextY] == 1) {
                            continue;
                        }

                        visit[nextX][nextY] = true;
                        queue.offer(new int[]{nextX, nextY});
                    }
                }
            }
            return -1;
        }
    }
}
