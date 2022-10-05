package Programmers.level0;

public class ReverseString {

  public static void main(String[] args) {

  }
  static class Solution {
    public String solution(String my_string) {
      StringBuilder sb = new StringBuilder();

      sb.append(my_string);

      return sb.reverse().toString();
    }
  }
}
