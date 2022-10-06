package Programmers.level0;

import java.util.Arrays;

public class CloseNumber {

  public static void main(String[] args) {

  }
  static class Solution {
    public int solution(int[] array, int n) {
      int answer = 0;
      Arrays.sort(array);
      int count = Integer.MAX_VALUE;
      for (int i = 0; i <array.length ; i++) {
        if(count > Math.abs(n-array[i])){
          count = Math.abs(n-array[i]);
          answer = array[i];
        }
      }


      return answer;
    }
  }
}
