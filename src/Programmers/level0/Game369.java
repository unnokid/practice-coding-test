package Programmers.level0;

public class Game369 {

  public static void main(String[] args) {
    Solution solution = new Solution();
    int order;
    order = 9301;
  }
  static class Solution {
    public int solution(int order) {
      int answer = 0;

      while(order>0){
        int target = order%10;
        if(target%3==0 && target != 0){
          answer++;
        }
        order = order/10;
      }

      return answer;
    }
  }
}
