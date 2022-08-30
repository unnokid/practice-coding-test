package leetcode;

import java.util.Arrays;

public class DetermineWhetherMatrixCanBeObtainedByRotation {

  public static void main(String[] args) {
    Solution solution = new Solution();
    int[][] mat;
    int[][] target;
    mat = new int[][]{{0,1},{1,0}};
    target = new int[][]{{1,0},{0,1}};
  }
  static class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
      
      //mat 를 회전시켜서 target를 만들 수 있는지 여부 판별
      // 각 90를 4번 돌려서 target과 일치하는지 검증 
      for (int i = 0; i < 4; i++) {
        if(Arrays.deepEquals(mat, target)){
          return true;
        }
        rotate(mat);
      }
      return false;
    }

    void rotate(int[][] mat){
      for(int i=0; i<mat.length; i++){
        for(int j=i; j<mat.length; j++){

          int temp = mat[i][j];
          mat[i][j] = mat[j][i];
          mat[j][i] = temp;
        }
      }

      for(int i=0; i<mat.length; i++){
        int before=0;
        int after=mat.length-1;
        while(before<after){
          int temp = mat[i][before];
          mat[i][before] = mat[i][after];
          mat[i][after] = temp;
          before++;
          after--;
        }
      }
    }
  }

}
