package leetcode;

public class IslandPerimeter {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] grid;
        grid = new int[][]{{0,1,0,0},{1,1,1,0},{0,1,0,0},{1,1,0,0}};
        System.out.println(solution.islandPerimeter(grid));
    }
    static class Solution {
        public int islandPerimeter(int[][] grid) {
            //섬의 지도를 주었을때 경계선으로의 길이를 구하기
            int land = 0;
            int side = 0;

            for (int i = 0; i < grid.length; ++i)
                for (int j = 0; j < grid[0].length; ++j)
                    if (grid[i][j] == 1) {
                        land++;
                        if (i - 1 >= 0 && grid[i - 1][j] == 1)
                            side++;
                        if (j - 1 >= 0 && grid[i][j - 1] == 1)
                            side++;
                    }

            return land * 4 - side * 2;
        }
    }
}
