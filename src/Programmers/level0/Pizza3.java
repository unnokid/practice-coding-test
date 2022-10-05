package Programmers.level0;

public class Pizza3 {

  public static void main(String[] args) {

  }
  static class Solution {
    public int solution(int slice, int n) {
      if(n%slice ==0){
        return n/slice;
      }else{
        return n/slice +1;
      }
    }
  }
}
