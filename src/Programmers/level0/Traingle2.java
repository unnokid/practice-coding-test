package Programmers.level0;

import java.util.Arrays;

public class Traingle2 {

  public static void main(String[] args) {

  }
  static class Solution {
    public int solution(int[] sides) {
      int answer = 0;

      Arrays.sort(sides);
      //가장 긴변 생성
      for (int i = sides[1]+1; i <sides[0]+sides[1] ; i++) {
        answer++;
      }
      //두개중에 긴변이 존재하는 경우
      for (int i = sides[1]-sides[0]+1; i <=sides[1] ; i++) {
        answer++;
      }

      return answer;
    }
  }
}
