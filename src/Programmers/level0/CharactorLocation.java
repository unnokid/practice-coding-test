package Programmers.level0;

import java.util.Arrays;

public class CharactorLocation {

  public static void main(String[] args) {
    Solution solution = new Solution();
    String[] key;
    int[] board;
    key = new String[]{"left", "right", "up", "right", "right"};
    board = new int[]{11,11};
    System.out.println(Arrays.toString(solution.solution(key, board)));
  }
  static class Solution {
    public int[] solution(String[] keyinput, int[] board) {
      int[] answer = new int[]{0,0};

      int width = (board[0]-1)/2;
      int height = (board[1]-1)/2;
      //left right [0] 영향, up down [1] 영향
      for (int i = 0; i < keyinput.length ; i++) {
        String target = keyinput[i];
        if(target.equals("left")){
          if(width == -answer[0]){
            continue;
          }
          answer[0]--;
        }else if(target.equals("right")){
          if(width == answer[0]){
            continue;
          }
          answer[0]++;
        }else if(target.equals("up")){
          if(height == answer[1]){
            continue;
          }
          answer[1]++;
        }else{
          if(height == -answer[1]){
            continue;
          }
          answer[1]--;
        }
      }

      return answer;
    }
  }
}
