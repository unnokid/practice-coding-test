package leetcode;

public class UniquePaths3 {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] grid;
        grid = new int[][]{{1, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 2, -1}};
        System.out.println(solution.uniquePathsIII(grid));

    }

    static class Solution {
        public int uniquePathsIII(int[][] grid) {
            int x = 0;
            int y = 0;
            int target = 0;
            for(int i = 0;i < grid.length;i++){
                for(int j = 0;j < grid[i].length;j++){
                    if(grid[i][j] == 1){
                        x = i;
                        y = j;
                    }else if(grid[i][j] == 0){
                        target++;
                    }
                }
            }
            return dfs(grid,x,y,target + 1);
        }

        private int dfs(int[][] grid, int x, int y, int target) {
            if(x >= grid.length || x < 0 || y >= grid[x].length || y < 0 || grid[x][y] == -1) return 0;

            if(grid[x][y] == 2){
                if(target == 0) return 1;
                return 0;
            }


            int temp = grid[x][y];
            grid[x][y] = -1;

            int result = dfs(grid,x + 1,y,target - 1) +
                dfs(grid,x - 1,y,target - 1) +
                dfs(grid,x,y + 1,target - 1) +
                dfs(grid,x,y - 1,target - 1);

            grid[x][y] = temp;
            return result;
        }
    }
}
