package Programmers.level0;

public class Bead {

  public static void main(String[] args) {

  }
  static class Solution {
    public long solution(int balls, int share) {
      //8C3 == 8C5
      share = Math.min(balls-share,share);

      if(share ==0 ){
        return 1L;
      }
      long result = solution(balls-1, share-1);
      result *= balls;
      result/=share;

      return result;
    }

  }
}
