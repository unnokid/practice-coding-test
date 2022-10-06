package Programmers.level0;

public class Pizza2 {

  public static void main(String[] args) {

  }
  static class Solution {
    public int solution(int n) {
      int answer = 1;
      int p = 6;
      while(true){
        if(p%n ==0){
          return answer;
        }
        p+=6;
        answer++;
      }


    }
  }
}
