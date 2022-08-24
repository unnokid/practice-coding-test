package leetcode;

public class IntegerBreak {

  public static void main(String[] args) {
    Solution solution = new Solution();
    int n;
    n= 7;
    System.out.println(solution.integerBreak(n));
    n= 8;
    System.out.println(solution.integerBreak(n));
    n= 9;
    System.out.println(solution.integerBreak(n));
    n= 10;
    System.out.println(solution.integerBreak(n));
  }
  static class Solution {
    public int integerBreak(int n) {
      //n이 주어질때 a+b 형태로 나눌수 있고
      // a*b 값이 가장 큰 return 값

      // 1 2 4 6 9 12 18 27 36 54 81
      //초반 1 2 4 제외한 이후 3의 배수로 올라감
      int[] remain = new int[]{1, 4, 2};
      int result = 0;
      if(n == 2){
        return 1;
      }
      if(n == 3){
        return 2;
      }
      if(n == 4){
        return 4;
      }
      int target;
      target = n%3 == 1 ? (n-4)/3 : n/3;
      result = (int) Math.pow(3, target) * (remain[n%3]);

      return result;
    }
  }

}
