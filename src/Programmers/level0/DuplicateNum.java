package Programmers.level0;

import java.util.Arrays;

public class DuplicateNum {

  public static void main(String[] args) {

  }
  static class Solution {
    public int solution(int[] array, int n) {
      int result =0;
      Arrays.sort(array);
      for (int i = 0; i <array.length ; i++) {
        if(array[i] == n){
          result++;
        }
      }
      return result;
    }
  }
}
