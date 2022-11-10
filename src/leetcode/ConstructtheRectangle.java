package leetcode;

public class ConstructtheRectangle {

  public static void main(String[] args) {

  }
  static class Solution {
    public int[] constructRectangle(int area) {
      int width = (int) Math.sqrt(area);
      while (area % width != 0) width -= 1;
      return new int[]{area / width, width};
    }
  }
}
