package leetcode;

import java.util.ArrayList;
import java.util.List;

public class NumbersWithSameConsecutiveDifferences {

  public static void main(String[] args) {

  }
  static class Solution {
    public int[] numsSameConsecDiff(int n, int k) {
      if (n == 1)
        return new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

      List<Integer> results = new ArrayList<Integer>();
      for (int num = 1; num < 10; ++num)
        dfs(n - 1, num, k, results);


      return results.stream().mapToInt(i->i).toArray();
    }
    private void dfs(int N, int num, int K, List<Integer> results) {
      if (N == 0) {
        results.add(num);
        return;
      }
      List<Integer> nextDigits = new ArrayList<>();

      Integer tailDigit = num % 10;
      nextDigits.add(tailDigit + K);
      if (K != 0)
        nextDigits.add(tailDigit - K);
      for (Integer nextDigit : nextDigits) {
        if (0 <= nextDigit && nextDigit < 10) {
          Integer newNum = num * 10 + nextDigit;
          dfs(N - 1, newNum, K, results);
        }
      }
    }
  }

}
