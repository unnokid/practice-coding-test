package leetcode;

public class ConcatenationofConsecutiveBinaryNumbers {

  public static void main(String[] args) {
    Solution solution = new Solution();
    int n;
    n= 1;
    System.out.println(solution.concatenatedBinary(n));
    n= 3;
    System.out.println(solution.concatenatedBinary(n));
  }
  static class Solution {
    public int concatenatedBinary(int n) {
      StringBuilder sb = new StringBuilder();
      long modulo = (long) (Math.pow(10,9) + 7);
      long result =0;
      for (int i = 1; i <= n; i++) {
        int temp = i;
        while (temp > 0) {
          temp /= 2;
          result *= 2;
        }
        result = (result + i) % modulo;
      }
      return (int) result;
    }
  }
}
