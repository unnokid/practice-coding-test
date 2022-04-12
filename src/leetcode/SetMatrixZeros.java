package leetcode;

public class SetMatrixZeros {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] matrix;
        matrix = new int[][]{{1,1,1},{1,0,1},{1,1,1}};
       solution.setZeroes(matrix);
    }
    static class Solution {
        public void setZeroes(int[][] matrix) {
            //0이 존재하면 그 i값, j값도 다 0으로 만들기

            boolean[] row = new boolean[matrix.length];
            boolean[] col = new boolean[matrix[0].length];

            for (int i = 0; i <matrix.length ; i++) {
                for (int j = 0; j <matrix[0].length ; j++) {
                    if (matrix[i][j] == 0){
                        row[i] = true;
                        col[j] = true;
                    }
                }
            }

            for (int i = 0; i <matrix.length ; i++) {
                for (int j = 0; j <matrix[0].length ; j++) {
                    if (row[i] || col[j]){
                        matrix[i][j] =0;
                    }
                }
            }

        }
    }
}
