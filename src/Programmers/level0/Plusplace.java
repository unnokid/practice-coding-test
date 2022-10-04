package Programmers.level0;

public class Plusplace {

  public static void main(String[] args) {

  }
  static class Solution {
    public int solution(int n) {
      int answer = 0;

      while(n>0){
        answer +=n%10;
        n/=10;
      }
      return answer;
    }
  }
}
