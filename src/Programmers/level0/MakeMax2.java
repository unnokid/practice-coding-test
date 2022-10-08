package Programmers.level0;

import java.util.Arrays;

public class MakeMax2 {

  public static void main(String[] args) {

  }
  static class Solution {
    public int solution(int[] numbers) {
      Arrays.sort(numbers);
      return Math.max(numbers[0]*numbers[1],numbers[numbers.length-1]*numbers[numbers.length-2]);
    }
  }
}
