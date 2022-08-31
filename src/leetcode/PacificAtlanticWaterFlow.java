package leetcode;

import java.util.ArrayList;
import java.util.List;

public class PacificAtlanticWaterFlow {

  public static void main(String[] args) {
    Solution solution = new Solution();
    int[][] heights;
    heights = new int[][]{{1,2,2,3,5},{3,2,3,4,4},{2,4,5,3,1},{6,7,1,4,5},{5,1,1,2,4}};
    System.out.println(solution.pacificAtlantic(heights));
  }

  static class Solution {
    int pac =0;
    int atl =0;
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
      List<List<Integer>> result = new ArrayList<>();
      for (int i = 0; i <heights.length ; i++) {
        for (int j = 0; j <heights[0].length ; j++) {

          pac =0;
          atl =0;
          List<Integer> list = new ArrayList<>();
          if(dfs(heights,i,j)){
            list.add(i);
            list.add(j);
            result.add(list);
          }
        }
      }
      return result;
    }
    boolean dfs(int[][] heights, int i, int j){
      //좌표 검증
      if(i<0||j<0||i>=heights.length || j>heights[0].length ||heights[i][j] == -1){
        return false;
      }

      //결국 바다로 나가기위해선 양쪽모서리를 지나쳐야 됨
      //pac 타겟 윗줄이거나 왼쪽
      if(j == 0 || i == 0){
        pac = 1;
      }
      //atl 타켓 오른쪽이거나 아랫줄
      if(j == heights[0].length-1 || i == heights.length-1){
        atl = 1;
      }

      //둘다
      if(pac ==1 && atl ==1){
        return true;
      }

      int value = heights[i][j];
      heights[i][j] = -1;
      boolean left = false;
      boolean right = false;
      boolean up = false;
      boolean down = false;

      //left
      if(j>=1 && value >= heights[i][j-1]){
        left = dfs(heights,i,j-1);
      }
      //right
      if(j<=heights[0].length-2 && value >=heights[i][j+1]){
        right = dfs(heights,i,j+1);
      }
      //up
      if(i>=1 && value >= heights[i-1][j]){
        up = dfs(heights,i-1,j);
      }
      //down
      if(i<=heights.length-2 && value >= heights[i+1][j]){
        down = dfs(heights,i+1,j);
      }
      //-1로 중복처리 안되게 막은거 리셋
      heights[i][j] = value;

      return left||up||right||down;
    }
  }
}
