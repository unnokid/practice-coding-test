package Programmers.level0;

public class FindNumber {

  public static void main(String[] args) {

  }
  static class Solution {
    public int solution(int num, int k) {
      int answer = -1;
      String temp = String.valueOf(num);
      for (int i = 0; i <temp.length() ; i++) {
        if(temp.charAt(i) == k+'0'){
          answer = i+1;
          break;
        }
      }
      return answer;
    }
  }
}
