package Programmers.level0;

public class Germ {

  public static void main(String[] args) {

  }
  static class Solution {
    public int solution(int n, int t) {

      while (t>0){
        t--;
        n*=2;
      }
      return n;
    }
  }
}
