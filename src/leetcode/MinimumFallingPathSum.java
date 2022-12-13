package leetcode;

public class MinimumFallingPathSum {

    public static void main(String[] args) {

    }
    static class Solution {
        public int minFallingPathSum(int[][] matrix) {

            int[][] map = new int[matrix.length][matrix[0].length];
            int result = Integer.MAX_VALUE;
            for (int i = 0; i <map[0].length ; i++) {
                map[0][i] = matrix[0][i];
            }

            for (int i = 1; i <map.length ; i++) {
                for (int j = 0; j <map[0].length ; j++) {
                    if(j ==0){
                        map[i][j] = Math.min(map[i-1][j]+matrix[i][j], map[i-1][j+1]+matrix[i][j]);
                    }else if(j == map[0].length-1){
                        map[i][j] = Math.min(map[i-1][j]+matrix[i][j], map[i-1][j-1]+matrix[i][j]);
                    }else{
                        map[i][j] = Math.min(Math.min(map[i-1][j]+matrix[i][j], map[i-1][j-1]+matrix[i][j]),map[i-1][j+1]+matrix[i][j]);
                    }
                }
            }

            for (int i = 0; i <map[0].length ; i++) {
                result = Math.min(result, map[map.length-1][i]);
            }
            return result;
        }

    }
}
