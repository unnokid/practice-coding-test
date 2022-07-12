package leetcode;

import java.util.Arrays;

public class MatchstickstoSquare {

  public static void main(String[] args) {
    Solution solution = new Solution();
  }
  static class Solution {
    public boolean makesquare(int[] matchsticks) {
      //성냥 길이에 대한 배열
      //성냥은 부술수 없고 모든 성냥 사용하여 정사각형 만들기
      int total =0;
      for (int i = 0; i <matchsticks.length ; i++) {
        total+=matchsticks[i];
      }
      if(total%4 !=0){
        return false;
      }

      //1단계 거르기는 통과했으니 직접 만들수 있을지 확인해보기
      int[] map = {total/4 , total/4 , total/4 , total/4};
      Arrays.sort(matchsticks);
      return match(matchsticks, map, matchsticks.length -1);
    }
  }
  private static boolean match(int[] matchsticks, int[] map, int target){
    if(target == -1)return map[0] == map[1] && map[1] == map[2] && map[2] == map[3];

    for(int i = 0 ; i < map.length ; i++)
    {
      if(matchsticks[target] <=map[i])
      {
        map[i]-=matchsticks[target];
        if(match(matchsticks , map , target - 1)){
          return true;
        }
        map[i]+=matchsticks[target];
      }
    }

    return false;
  }

}
