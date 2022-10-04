package Programmers.level0;

public class MakeArrayMultiple {

  public static void main(String[] args) {

  }
  static class Solution {
    public int[] solution(int[] numbers) {
      for (int i = 0; i <numbers.length ; i++) {
        numbers[i] *= 2;
      }
      return numbers;
    }
  }
}
