package Programmers.level0;

public class ChickenCoupon {

  public static void main(String[] args) {
    Solution solution = new Solution();
    int chicken;
//    chicken = 1081;
//    System.out.println(solution.solution(chicken));
    chicken = 1999;
    System.out.println(solution.solution(chicken));
  }
  static class Solution {
    public int solution(int chicken) {
      int answer = 0;
      int coupon = chicken;
      int remain = 0;
      while(coupon>0){
        //쿠폰으로 주문
        answer+=coupon/10;
        remain+=coupon%10;
        coupon/=10;
      }
      while(remain >9){
        answer+=remain/10;
        remain=remain/10 + remain%10;
      }


      return answer;
    }
  }
}
