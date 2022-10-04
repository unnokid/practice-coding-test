package Programmers.level0;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Rank {

  public static void main(String[] args) {
    Solution solution = new Solution();
    int[][] score;
    score = new int[][]{{80,70},{90,50},{40,70},{50,80}};
    System.out.println(Arrays.toString(solution.solution(score)));
    score = new int[][]{{80,70},{70,80},{30,50},{90,100},{100,90},{100,100},{10,30}};
    System.out.println(Arrays.toString(solution.solution(score)));
    score = new int[][]{{0,20},{80,100},{10,10},{90,90},{20,0}};
    System.out.println(Arrays.toString(solution.solution(score)));
  }
  static class Solution {
    public int[] solution(int[][] score) {
      double[] map = new double[score.length];
      int[] result= new int[score.length];
      for (int i = 0; i <score.length ; i++) {
        map[i] = (score[i][0]+ score[i][1])/2.0;
      }

      for (int i = 0; i <score.length ; i++) {
        int count =0;
        for (int j = 0; j <score.length ; j++) {
          if(map[i] < map[j]){
            count++;
          }
        }
        result[i] = count+1;
      }

      return result;
    }
  }


}
