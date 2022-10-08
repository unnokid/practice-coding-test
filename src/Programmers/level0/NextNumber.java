package Programmers.level0;

public class NextNumber {

  public static void main(String[] args) {

  }
  static class Solution {
    public int solution(int[] common) {
      if(common[1] - common[0] == common[2] - common[1]){
        //등차
        return common[common.length-1]+(common[1]-common[0]);
      }

      double r  = common[1]*1.0/common[0];


      return (int) (common[common.length-1]*r);
    }
  }
}
