package Programmers.level0;

import java.util.Arrays;

public class Square {

  public static void main(String[] args) {

  }
  static class Solution {
    public int solution(int[][] dots) {
      double[] map = new double[3];

      for (int i = 0; i <3 ; i++) {
        double d;
        int xd, yd;
        yd = (int) Math.pow((dots[0][0]-dots[i+1][0]),2);
        xd = (int) Math.pow((dots[0][1]-dots[i+1][1]),2);
        d = Math.sqrt(yd+xd);
        map[i] = d;
      }
      Arrays.sort(map);

      return (int) (map[0]*map[1]);
    }
  }
}
