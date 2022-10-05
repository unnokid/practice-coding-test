package Programmers.level0;

public class ArraySort2 {

  public static void main(String[] args) {

  }
  static class Solution {
    public String solution(String my_string) {
      my_string = my_string.toLowerCase();
      String answer = my_string.chars()
          .sorted()
          .collect(StringBuilder::new,
              StringBuilder::appendCodePoint,
              StringBuilder::append)
          .toString();
      return answer;
    }
  }
}
