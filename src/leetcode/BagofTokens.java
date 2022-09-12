package leetcode;

import java.util.Arrays;

public class BagofTokens {

  public static void main(String[] args) {

  }
  static class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {

      Arrays.sort(tokens);
      int left = 0;
      int right = tokens.length - 1;
      int points = 0, ans = 0;
      while (left <= right && (power >= tokens[left] || points > 0)) {
        while (left <= right && power >= tokens[left]) {
          power -= tokens[left++];
          points++;
        }

        ans = Math.max(ans, points);
        if (left <= right && points > 0) {
          power += tokens[right--];
          points--;
        }
      }

      return ans;
    }
  }
}
