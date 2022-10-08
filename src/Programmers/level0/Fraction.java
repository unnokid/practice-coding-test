package Programmers.level0;

public class Fraction {

  public static void main(String[] args) {

  }
  static class Solution {
    public int[] solution(int denum1, int num1, int denum2, int num2) {
      int[] answer = new int[2];

      int up = denum1*num2 + denum2*num1;
      int down = num1 * num2;
      int gcd =getGCD(up,down);
      if(gcd != 1){
        up/=gcd;
        down/=gcd;
      }
      answer[0] = up;
      answer[1] = down;
      return answer;
    }
    public static int getGCD(int num1, int num2) {
      if (num1 % num2 == 0) {
        return num2;
      }
      return getGCD(num2, num1%num2);
    }
  }


}
