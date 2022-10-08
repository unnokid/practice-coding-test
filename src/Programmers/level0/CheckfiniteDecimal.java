package Programmers.level0;

public class CheckfiniteDecimal {

  public static void main(String[] args) {
    Solution solution = new Solution();
    int a;
    int b;
    a= 7;
    b =20;
    System.out.println(solution.solution(a,b));
    a= 11;
    b =22;
    System.out.println(solution.solution(a,b));
    a= 12;
    b =21;
    System.out.println(solution.solution(a,b));
  }
  static class Solution {
    public int solution(int a, int b) {
      int min = Math.min(a, b);
      int gcd = 0;
      for (int i = 1; i <=min ; i++) {
        if(a%i == 0 && b%i == 0){
          gcd = i;
        }
      }
      System.out.println("gcd:"+gcd);

      if(gcd != 1){
        a/=gcd;
        b/=gcd;
      }

      while(b>1){
        System.out.println("현재 b");
        if(b%2==0){
          b/=2;
        }else if(b%5==0){
          b/=5;
        }else{
          return 2;
        }
      }

      return 1;
    }
  }
}
