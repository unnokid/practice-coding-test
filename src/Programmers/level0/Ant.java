package Programmers.level0;

public class Ant {

  public static void main(String[] args) {

  }
  static class Solution {
    public int solution(int hp) {
      int answer = 0;

      answer+=hp/5;
      hp = hp%5;
      answer+=hp/3;
      hp = hp%3;
      answer+=hp;
      return answer;
    }
  }
}
