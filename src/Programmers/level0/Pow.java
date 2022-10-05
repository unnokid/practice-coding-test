package Programmers.level0;

public class Pow {

  public static void main(String[] args) {

  }
  static class Solution {
    public int solution(int n) {

      double temp = Math.sqrt(n);
      int before = (int) temp;

      return before == temp ? 1:2;
    }
  }
}
