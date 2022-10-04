package Programmers.level0;

import java.util.Arrays;

public class Median {

  public static void main(String[] args) {

  }
  static class Solution {
    public int solution(int[] array) {
      //기존 조건이 홀수값이라 길이가 짝수일때 체크안해줌
      Arrays.sort(array);
      return array[array.length/2];
    }
  }


}
