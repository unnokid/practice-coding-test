package leetcode;

import java.util.Arrays;

public class UniquePaths2 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] map;
        map = new int[][]{{0,0,0},{0,1,0},{0,0,0}};
        System.out.println(solution.uniquePathsWithObstacles(map));
        map = new int[][]{{0,1},{0,0}};
        System.out.println(solution.uniquePathsWithObstacles(map));
        map = new int[][]{{1,0}};
        System.out.println(solution.uniquePathsWithObstacles(map));
    }
    static class Solution {
        public int uniquePathsWithObstacles(int[][] obstacleGrid) {
            //아래 오른쪽으로 이동가능
            //왼쪽 맨위에서 오른쪽 맨아래까지 도달하는 경로 개수
            int m = obstacleGrid.length;
            int n = obstacleGrid[0].length;

            if(obstacleGrid[0][0] == 1){
                return 0;
            }
            //시작값 주기
            obstacleGrid[0][0] =1;

            for (int i = 1; i < m; i++) {
                if(obstacleGrid[i][0] ==0 && obstacleGrid[i-1][0] == 1){
                    obstacleGrid[i][0] = 1;
                }else{
                    obstacleGrid[i][0] = 0;
                }

            }
            for (int i = 1; i <n ; i++) {
                if(obstacleGrid[0][i] == 0 && obstacleGrid[0][i-1] == 1){
                    obstacleGrid[0][i] = 1;
                }else{
                    obstacleGrid[0][i] = 0;
                }
            }
            for (int i = 1; i <m ; i++) {
                for (int j = 1; j <n ; j++) {
                    if (obstacleGrid[i][j] == 0) {
                        obstacleGrid[i][j] = obstacleGrid[i - 1][j] + obstacleGrid[i][j - 1];
                    } else {
                        obstacleGrid[i][j] = 0;
                    }
                }
            }
            return obstacleGrid[m-1][n-1];
        }
    }

}
