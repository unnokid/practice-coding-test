package Programmers.level0;

public class Multiple {

  public static void main(String[] args) {
    Solution solution = new Solution();
    int num1;
    int num2;
    num1=3;
    num2=4;
    System.out.println(solution.solution(num1,num2));
  }
  static class Solution {
    public int solution(int num1, int num2) {

      return num1*num2;
    }
  }
}
