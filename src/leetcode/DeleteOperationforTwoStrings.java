package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class DeleteOperationforTwoStrings {

  public static void main(String[] args) {
    Solution solution = new Solution();
    String word1;
    String word2;
    word1 = "sea";
    word2 = "eat";
    System.out.println(solution.minDistance(word1, word2));
    word1 = "a";
    word2 = "a";
    System.out.println(solution.minDistance(word1, word2));
    word1 = "park";
    word2 = "spake";
    System.out.println(solution.minDistance(word1, word2));
    word1 = "abc";
    word2 = "bcd";
    System.out.println(solution.minDistance(word1, word2));
    word1 = "leetcode";
    word2 = "etco";
    System.out.println(solution.minDistance(word1, word2));
  }
  static class Solution {
    public int minDistance(String word1, String word2) {

      int n = word1.length();
      int m = word2.length();
      int[][] map = new int[n+1][m+1];

      for (int i = 1; i <=n ; i++) {
        for (int j = 1; j <=m ; j++) {

          if(word1.charAt(i-1)== word2.charAt(j-1)){
            map[i][j] = map[i-1][j-1] +1;
          }else{
            map[i][j] = Math.max(map[i-1][j], map[i][j-1]);
          }
        }
      }

      return n + m - 2* map[n][m];
    }
  }
}
