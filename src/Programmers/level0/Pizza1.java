package Programmers.level0;

public class Pizza1 {

  public static void main(String[] args) {

  }
  static class Solution {
    public int solution(int n) {

      if(n%7 ==0){
        return n/7;
      }else{
        return n/7 +1;
      }

    }
  }
}
