package leetcode;

public class ImageOverlap {

  public static void main(String[] args) {

  }
  static class Solution {
    public int largestOverlap(int[][] img1, int[][] img2) {

      int max = 0;
      for (int i = -img1.length; i < img1.length; i++) {
        for (int j = -img1[0].length; j < img1[0].length; j++) {
          max = Math.max(max, overlap(img1,img2,i,j));
        }
      }
      return max;
    }
    int overlap(int[][] img1,int[][] img2, int row, int col){
      int count =0 ;
      for (int i = 0; i <img1.length ; i++) {
        for (int j = 0; j <img1[0].length ; j++) {
          if(i+row<0 || j+col <0 || i+row>= img1.length || j+col>= img1[0].length){
            continue;
          }
          if(img1[i][j] ==1 && img2[i+row][j+col] == 1){
            count++;
          }
        }
      }
      return count;
    }

  }
}
