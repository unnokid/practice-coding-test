package leetcode;

import java.util.Arrays;

public class MaximalSquare {
    public static void main(String[] args) {
        Solution solution = new Solution();
        char[][] matrix;
        matrix = new char[][]{{'1','0','1','0','0'},{'1','0','1','1','1'},{'1','1','1','1','1'},{'1','0','0','1','0'}};
        System.out.println(solution.maximalSquare(matrix));
    }
    static class Solution {
        public int maximalSquare(char[][] matrix) {
            //행렬이 주어질때 가장 큰값을 가지는 정사각형 값
            //앞에 대각선, 위, 왼쪽 을 보고 +1하기
            int[][] map = new int[matrix.length+1][matrix[0].length+1];
            int max =0;

            for (int i = 1; i <= matrix.length; i++) {
                for (int j = 1; j < matrix[0].length +1; j++) {
                    if(matrix[i-1][j-1] =='1'){
                        map[i][j] = Math.min(map[i-1][j],Math.min(map[i][j-1], map[i-1][j-1]))+1;
                    }
                    max = Math.max(map[i][j], max);
                    System.out.println(Arrays.deepToString(map));
                }
            }
            return max*max;
        }
    }
}
