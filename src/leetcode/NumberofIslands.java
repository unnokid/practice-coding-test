package leetcode;

public class NumberofIslands {
    public static void main(String[] args) {
        Solution solution = new Solution();
        char[][] grid;
        grid = new char[][]{{'1','1','1','1','0'},
                            {'1','1','0','1','0'},
                            {'1','1','0','0','0'},
                            {'0','0','0','0','0'}};
        System.out.println(solution.numIslands(grid));
        grid = new char[][]{{'1','1','0','0','0'},
                            {'1','1','0','0','0'},
                            {'0','0','1','0','0'},
                            {'0','0','0','1','1'}};
        System.out.println(solution.numIslands(grid));
    }
    static class Solution {
        static int[] dx = {0,0,1,-1};
        static int[] dy = {1,-1,0,0};
        public int numIslands(char[][] grid) {
            //지도에 대한 2차원 배열을 줄때
            //섬으로 인식되어지는 블럭의 개수를 return
            int m = grid.length;
            int n = grid[0].length;
            int answer =0;
            boolean[][] visit = new boolean[m][n];

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n ; j++) {
                    if(!visit[i][j] && grid[i][j] == '1'){
                        answer++;
                        dfs(visit,i,j,grid);
                    }
                }
            }
            return answer;
        }
        void dfs(boolean[][] visit,int i,int j,char[][] grid){
            if(visit[i][j] || grid[i][j] == '0'){
               return;
            }

            visit[i][j] = true;
            for (int k = 0; k <4 ; k++) {
                int newX=dx[k]+i;
                int newY=dy[k]+j;
                if(newX <0 || newX>= grid.length){
                    newX = i;
                }
                if(newY <0 || newY>= grid[0].length){
                    newY = j;
                }

                dfs(visit,newX,newY,grid);
            }
        }

    }
}
