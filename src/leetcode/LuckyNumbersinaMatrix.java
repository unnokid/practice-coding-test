package leetcode;

import java.util.ArrayList;
import java.util.List;

public class LuckyNumbersinaMatrix {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] matrix;
        matrix = new int[][]{{3,7,8},{9,11,13},{15,16,17}};
        System.out.println(solution.luckyNumbers(matrix));
    }
    static class Solution {
        public List<Integer> luckyNumbers (int[][] matrix) {
            //row에서는 가장 작고 column에서는 제일큰 요소를 가진 값 return
            List<Integer> arr = new ArrayList<Integer>();
            for(int i=0 ; i<matrix.length ; i++){
                int min = 0;
                //row에서 가장 작은 값 찾기
                for(int j=0 ; j<matrix[i].length ; j++){
                    if(matrix[i][j]<matrix[i][min]){
                        min = j;
                    }

                }
                //column에서 가장 큰 값 찾기
                int max =0;
                for(int k=0 ; k<matrix.length ; k++){
                    if(matrix[k][min]>matrix[max][min]){
                        max =k;
                    }
                }
                //m[i][min] == m[max][min]을 확인해야함
                // 따라서 i==max
                if(i==max){
                    arr.add(matrix[i][min]);
                }
            }
            return arr;
        }
    }
}
