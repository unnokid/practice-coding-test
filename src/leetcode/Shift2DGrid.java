package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Shift2DGrid {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] grid;
        int k;
        grid = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        k=1;
        System.out.println(solution.shiftGrid(grid,k));
    }
    static class Solution {
        public List<List<Integer>> shiftGrid(int[][] grid, int k) {
            //k만큼 행렬 옆으로 k만큼 이동시키기
            int[][] map = new int[grid.length][grid[0].length];
            List<List<Integer>> answer = new ArrayList<>();
            //한바퀴 도는값 제거
            int m = grid.length;
            int n = grid[0].length;
            k = k % (m*n);
            int height = k / n;
            int width = k % n;

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    int moveI = i + height;
                    int moveJ = (j + width) % n;
                    // Move 1 row if (move_j + j >= n
                    if (width+j >= n) {
                        moveI++;
                    }
                    moveI %= m;
                    map[moveI][moveJ] = grid[i][j];
                }
            }
            for (int[] target : map) {
                List<Integer> list = new ArrayList<>();
                for (int v : target) {
                    list.add(v);
                }
                answer.add(list);
            }

            return answer;
        }
    }
}
