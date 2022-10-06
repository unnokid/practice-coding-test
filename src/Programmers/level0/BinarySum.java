package Programmers.level0;

public class BinarySum {

  public static void main(String[] args) {

  }
  static class Solution {
    public String solution(String bin1, String bin2) {
      int result = Integer.parseInt(bin1, 2) + Integer.parseInt(bin2, 2);

      return Integer.toBinaryString(result);
    }
  }
}
