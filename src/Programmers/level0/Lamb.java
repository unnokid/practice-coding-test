package Programmers.level0;

public class Lamb {

  public static void main(String[] args) {

  }
  static class Solution {
    public int solution(int n, int k) {
      int answer = 0;
      answer+=k*2000;
      answer-= n/10*2000;
      answer+=n*12000;
      return answer;
    }
  }
}
