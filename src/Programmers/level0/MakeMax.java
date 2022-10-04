package Programmers.level0;

import java.util.Arrays;

public class MakeMax {

  public static void main(String[] args) {

  }
  static class Solution {
    public int solution(int[] numbers) {
      Arrays.sort(numbers);
      return numbers[numbers.length-1]*numbers[numbers.length-2];
    }
  }
}
