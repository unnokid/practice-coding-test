package Programmers.level0;

public class Factorial {

  public static void main(String[] args) {

  }
  static class Solution {
    public int solution(int n) {
      int answer = 1;

      for (int i = 1; i <=10 ; i++) {
        answer*=i;
        if(answer == n){
          return i;
        }else if(answer > n){
          return i-1;
        }
      }

      return answer;
    }
  }

}
