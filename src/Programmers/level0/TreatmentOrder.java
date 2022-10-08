package Programmers.level0;

import java.util.Arrays;

public class TreatmentOrder {

  public static void main(String[] args) {

  }
  static class Solution {
    public int[] solution(int[] emergency) {
      int[] answer = new int[emergency.length];
      Arrays.fill(answer,1);
      for (int i = 0; i <emergency.length ; i++) {
        int target = emergency[i];
        for (int j = 0; j <emergency.length ; j++) {
          if(target>emergency[j]){
            answer[j]++;
          }
        }
      }
      return answer;
    }
  }
}
