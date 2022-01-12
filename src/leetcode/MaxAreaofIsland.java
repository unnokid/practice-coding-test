package leetcode;

public class MaxAreaofIsland {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] grid =
                {{0,0,1,0,0,0,0,1,0,0,0,0,0},
                {0,0,0,0,0,0,0,1,1,1,0,0,0},
                {0,1,1,0,1,0,0,0,0,0,0,0,0},
                {0,1,0,0,1,1,0,0,1,0,1,0,0},
                {0,1,0,0,1,1,0,0,1,1,1,0,0},
                {0,0,0,0,0,0,0,0,0,0,1,0,0},
                {0,0,0,0,0,0,0,1,1,1,0,0,0},
                {0,0,0,0,0,0,0,1,1,0,0,0,0}};
        System.out.println(solution.maxAreaOfIsland(grid));
    }
    static class Solution {
        public int maxAreaOfIsland(int[][] grid) {
            // m x n 매트릭스를 줌
            // 섬이 있음 1이 있는 지형
            //가장큰 지역의 크기
            int result =0;
            for (int i = 0; i < grid.length ; i++) {
                for (int j = 0; j < grid[0].length; j++) {
                    if(grid[i][j] == 1){
                        int count =check(grid,i,j);
                        //끝나면 가장큰 result만 남기기
                        result = Math.max(result,count);

                    }
                }
            }
            return result;
        }
        public int check(int[][] grid, int x, int y){

            //기준에 안맞으면 끝
            if(x<0 || y <0 || x >grid.length -1|| y > grid[0].length-1
                    || grid[x][y] == 0){
                return 0;
            }

            //들어간곳 0으로 바꾸기
            grid[x][y] = 0;
            int sum =1;
            //상하좌우 전개
            sum+=check(grid,x+1,y);
            sum+=check(grid,x-1,y);
            sum+=check(grid,x,y+1);
            sum+=check(grid,x,y-1);
            return sum;
        }
    }


}
