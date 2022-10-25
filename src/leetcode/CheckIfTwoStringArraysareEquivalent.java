package leetcode;

public class CheckIfTwoStringArraysareEquivalent {

  public static void main(String[] args) {

  }
  static class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
      StringBuilder first = new StringBuilder();
      StringBuilder second = new StringBuilder();

      for (String t : word1){
        first.append(t);
      }
      for (String t: word2){
        second.append(t);
      }
      return first.toString().equals(second.toString());
    }
  }
}
