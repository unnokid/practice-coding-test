package Programmers.level0;

import java.util.Arrays;

public class MakeMax2 {

  public static void main(String[] args) {

  }
  static class Solution {
    public int solution(int[] numbers) {
      int answer = 0;
      Arrays.sort(numbers);

      answer = Math.max(answer,numbers[0]*numbers[1]);
      answer = Math.max(answer,numbers[numbers.length-1]*numbers[numbers.length-2]);

      return answer;
    }
  }
}
