package leetcode;

public class Searcha2DMatrix {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] matrix;
        int target;
        matrix = new int[][]{{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        target = 3;
        System.out.println(solution.searchMatrix(matrix,target));
    }
    static class Solution {
        public boolean searchMatrix(int[][] matrix, int target) {
            //target을 찾고싶음
            //matrix는 왼쪽에서 오른쪽으로 정렬되어있고
            //크기순으로 정렬되어있음

            //세로로 먼저 값을 찾고
            //사잇값을 찾으면 오른쪽으로 찾기

            int row = matrix.length-1;
            int col = 0;
            while(row >= 0 && col < matrix[0].length){
                int cur = matrix[row][col];

                if(target == cur){
                    return true;
                }else if(target < cur){
                    row--;
                }else{
                    col++;
                }
            }

            return false;

        }
    }
}
