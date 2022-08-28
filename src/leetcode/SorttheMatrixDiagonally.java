package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SorttheMatrixDiagonally {

  public static void main(String[] args) {
    Solution solution = new Solution();
    int[][] mat;
    mat = new int[][]{{3, 3, 1, 1}, {2, 2, 1, 2}, {1, 1, 1, 2}};
    System.out.println(solution.diagonalSort(mat));
  }

  static class Solution {

    public int[][] diagonalSort(int[][] mat) {
      int rows = mat.length;
      int cols = mat[0].length;
      //Sorting diagonals of first row completely
      for (int i = 0; i < cols; i++) {
        sortDiagonal(mat, 0, i);
      }
      for (int i = 1; i < rows - 1; i++) {
        sortDiagonal(mat, i, 0);
      }
      return mat;
    }
  }
  static void sortDiagonal(int[][] mat, int i, int j) {
    List<Integer> a = new ArrayList<>();
    int x = i, y = j;
    while (i < mat.length && j < mat[0].length) {
      a.add(mat[i][j]);
      i++;
      j++;
    }
    Collections.sort(a);
    int count = 0;
    while (x < mat.length && y < mat[0].length) {
      mat[x][y] = a.get(count);
      count++;
      x++;
      y++;
    }
  }



}
