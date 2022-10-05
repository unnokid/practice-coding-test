package Programmers.level0;

import java.util.Arrays;

public class Triangle1 {

  public static void main(String[] args) {

  }
  static class Solution {
    public int solution(int[] sides) {

      Arrays.sort(sides);

      return sides[0]+sides[1] > sides[2]?1:2;
    }
  }
}
