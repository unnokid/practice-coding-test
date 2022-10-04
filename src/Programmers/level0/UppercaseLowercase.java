package Programmers.level0;

public class UppercaseLowercase {

  public static void main(String[] args) {
    Solution solution = new Solution();
    String s;
    s = "cccCCC";
    System.out.println(solution.solution(s));
  }
  static class Solution {
    public String solution(String my_string) {
      StringBuilder sb = new StringBuilder();

      for (int i = 0; i <my_string.length() ; i++) {
        char target = my_string.charAt(i);
        if(Character.isUpperCase(target)){
          sb.append((char)(target+32));
        }else {
          sb.append((char)(target-32));
        }
      }
      return sb.toString();
    }
  }
}
