package Programmers.level0;

public class HideSum {

  public static void main(String[] args) {

  }
  static class Solution {
    public int solution(String my_string) {
      int answer = 0;

      for (int i = 0; i <my_string.length() ; i++) {
        if(my_string.charAt(i)-'0' >=0 && my_string.charAt(i)-'0' <=9){
          answer+=my_string.charAt(i)-'0';
        }
      }
      return answer;
    }
  }
}
