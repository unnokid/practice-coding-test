package Programmers.level0;

public class PairCount {

  public static void main(String[] args) {

  }
  static class Solution {
    public int solution(int n) {
      int answer = 0;

      for (int i = 1; i <= n; i++) {
        if(n%i ==0){
          answer++;
        }
      }

      return answer;
    }
  }
}
