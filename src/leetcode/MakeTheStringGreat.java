package leetcode;

import java.util.Stack;

public class MakeTheStringGreat {

  public static void main(String[] args) {

  }
  static class Solution {
    public String makeGood(String s) {

      StringBuilder sb = new StringBuilder(s);

      while (sb.length() > 1) {
        boolean check = false;
        for (int i = 0; i < sb.length() - 1; ++i) {
          char currChar = sb.charAt(i);
          char nextChar = sb.charAt(i + 1);

          if (Math.abs(currChar - nextChar) == 32) {
            sb.deleteCharAt(i);
            sb.deleteCharAt(i);
            check = true;
            break;
          }
        }
        if (!check)
          break;
      }
      return sb.toString();
    }
  }
}
