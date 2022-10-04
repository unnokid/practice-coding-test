package Programmers.level0;

public class EvenSum {

  public static void main(String[] args) {

  }
  static class Solution {
    public int solution(int n) {
      int answer = 0;

      for (int i = 2; i <= n; i++) {
        if(i%2 ==0){
          answer+=i;
        }
      }

      return answer;
    }
  }
}
