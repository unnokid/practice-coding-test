package leetcode;

import java.util.Arrays;

public class SpiralMatrix2 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int n;
        n=3;
        System.out.println(Arrays.deepToString(solution.generateMatrix(n)));
        n=1;
        System.out.println(Arrays.deepToString(solution.generateMatrix(n)));
        n=4;
        System.out.println(Arrays.deepToString(solution.generateMatrix(n)));
    }
    static class Solution {
        public int[][] generateMatrix(int n) {

            //n*n 배열 형태에서
            //시계방향으로 돌면서 1~n*n 번호 넣은 2차원 배열 return

            //배열 생성
            int[][] map = new int[n][n];
            boolean[][] visit = new boolean[n][n];
            int count = 1;
            int x =0;
            int y =0;
            while(count <=n*n){
                while(y<n){
                    if(!visit[x][y]){
                        visit[x][y] = true;
                        map[x][y] = count;
                        y++;
                        count++;
                    }else{
                        break;
                    }
                }
                x++;
                y--;
                while(x<n){
                    if(!visit[x][y]){
                        visit[x][y] = true;
                        map[x][y] = count;
                        x++;
                        count++;
                    }else{
                        break;
                    }
                }
                x--;
                y--;
                while(y>=0){
                    if(!visit[x][y]){
                        visit[x][y] = true;
                        map[x][y] = count;
                        y--;
                        count++;
                    }else{
                        break;
                    }
                }
                y++;
                x--;
                while(x>=0){
                    if(!visit[x][y]){
                        visit[x][y] = true;
                        map[x][y] = count;
                        x--;
                        count++;
                    }else{
                        break;
                    }
                }
                x++;
                y++;
            }
            return map;
        }
    }
}
