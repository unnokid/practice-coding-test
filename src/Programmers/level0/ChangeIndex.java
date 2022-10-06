package Programmers.level0;

public class ChangeIndex {

  public static void main(String[] args) {

  }
  static class Solution {
    public String solution(String my_string, int num1, int num2) {
      StringBuilder sb = new StringBuilder();
      for (int i = 0; i <my_string.length() ; i++) {
        if(i == num1){
          sb.append(my_string.charAt(num2));
        }else if(i == num2){
          sb.append(my_string.charAt(num1));
        }else{
          sb.append(my_string.charAt(i));
        }
      }
      return sb.toString();
    }
  }
}
