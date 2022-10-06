package Programmers.level0;

public class ThrowBall {

  public static void main(String[] args) {

  }
  static class Solution {
    public int solution(int[] numbers, int k) {
      int target = (k-1)*2%numbers.length;

      return numbers[target];
    }
  }
}
