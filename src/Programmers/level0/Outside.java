package Programmers.level0;

public class Outside {

  public static void main(String[] args) {

  }
  static class Solution {
    public String solution(int age) {
      StringBuilder sb = new StringBuilder();

      while(age>0){
        int target = age%10;
        sb.append((char)(target+'a'));

        age/=10;
      }

      return sb.reverse().toString();
    }
  }
}
