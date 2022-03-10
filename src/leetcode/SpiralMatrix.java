package leetcode;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] matrix;
        matrix = new int[][] {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(solution.spiralOrder(matrix));
        matrix = new int[][] {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        System.out.println(solution.spiralOrder(matrix));
    }
    static class Solution {
        public List<Integer> spiralOrder(int[][] matrix) {
            //시계방향으로 돌면서 배열 순서 넣고 return

            List<Integer> list = new ArrayList<>();
            int m = matrix.length;
            int n = matrix[0].length;
            boolean[][] visit = new boolean[m][n];
            int count = m*n;
            int x =0;
            int y =0;
            while(count >0){
                while(y<n){
                    if(!visit[x][y]){
                        visit[x][y] = true;
                        list.add(matrix[x][y]);
                        y++;
                        count--;
                    }else{
                        break;
                    }
                }
                x++;
                y--;
                while(x<m){
                    if(!visit[x][y]){
                        visit[x][y] = true;
                        list.add(matrix[x][y]);
                        x++;
                        count--;
                    }else{
                        break;
                    }
                }
                x--;
                y--;
                while(y>=0){
                    if(!visit[x][y]){
                        visit[x][y] = true;
                        list.add(matrix[x][y]);
                        y--;
                        count--;
                    }else{
                        break;
                    }
                }
                y++;
                x--;
                while(x>=0){
                    if(!visit[x][y]){
                        visit[x][y] = true;
                        list.add(matrix[x][y]);
                        x--;
                        count--;
                    }else{
                        break;
                    }
                }
                x++;
                y++;
            }
            return list;
        }
    }
}
