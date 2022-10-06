package Programmers.level0;

public class RemoveChar {

  public static void main(String[] args) {

  }
  static class Solution {
    public String solution(String my_string, String letter) {

      return my_string.replaceAll(letter,"");
    }
  }
}
