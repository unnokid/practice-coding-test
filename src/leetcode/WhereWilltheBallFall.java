package leetcode;

public class WhereWilltheBallFall {

  public static void main(String[] args) {

  }
  static class Solution {
    public int[] findBall(int[][] grid) {
      int[] result = new int[grid[0].length];

      for (int i = 0; i <grid[0].length ; i++) {
        result[i] = check(0,i,grid);
      }
      return result;
    }
    int check(int row, int col, int[][] grid){
      if(row == grid.length){
        return col;
      }
      int next = col + grid[row][col];

      if(next <0 || next > grid[0].length-1 || grid[row][col] != grid[row][next]){
        return -1;
      }
      return check(row+1,next,grid);
    }
  }
}
