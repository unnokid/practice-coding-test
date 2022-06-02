package leetcode;

public class TransposeMatrix {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] matrix;
        matrix = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
    }
    static class Solution {
        public int[][] transpose(int[][] matrix) {
            int[][] result = new int[matrix[0].length][matrix.length];

            for (int i = 0; i <matrix.length ; i++) {
                for (int j = 0; j <matrix[0].length ; j++) {
                    result[j][i] = matrix[i][j];
                }
            }
            return result;
        }
    }
}
