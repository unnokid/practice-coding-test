package Programmers.level0;

public class IceAmericano {

  public static void main(String[] args) {

  }
  static class Solution {
    public int[] solution(int money) {
      int[] answer = new int[2];

      answer[0] = money/5500;
      answer[1] = money%5500;

      return answer;
    }
  }
}
